package com.dictionary.repository;

import com.dictionary.config.AppConstant;
import com.dictionary.entity.*;
import com.dictionary.factory.DefinitionFactory;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DictionaryRepository {

    public DictionaryRepository(){
        try {
            Files.createDirectories(Paths.get(AppConstant.STORAGE_DIR));
        } catch (IOException e){
            System.err.println("Không thể khởi tạo thư mục lưu trữ: " + e.getMessage());
        }
    }

    public void saveWordToFile(Word word) {
        String fileName = AppConstant.STORAGE_DIR + word.getKeyword().toLowerCase() + ".def";
        File file = new File(fileName);

        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            writer.println("@" + word.getKeyword());
            java.util.Set<String> uniqueDefs = new java.util.LinkedHashSet<>();
            for (Definition def : word.getDefinitions()) {
                writer.println(def.formatToString());
            }

            for (String defStr : uniqueDefs){
                writer.println(defStr);
            }

        } catch (IOException e) {
            System.err.println("Lỗi ghi file cho từ " + word.getKeyword() + ": " + e.getMessage());
        }
    }

    public void deleteWordFile(String keyword){
        String fileName = AppConstant.STORAGE_DIR + keyword.toLowerCase() + ".def";
        try {
            Files.deleteIfExists(Paths.get(fileName));
        } catch (IOException e) {
            System.err.println("Lỗi xóa file của từ " + keyword + ": " + e.getMessage());
        }
    }

    public List<Word> loadAllWordsFromStorage(){
        List<Word> loadedWords = new ArrayList<>();
        File folder = new File(AppConstant.STORAGE_DIR);
        File[] files = folder.listFiles(((dir, name) -> name.toLowerCase().endsWith(".def")));

        if (files == null){
            return loadedWords;
        }

        for (File file : files){
            try (BufferedReader reader = new BufferedReader(new FileReader(file))){
                parseSingleFile(reader, loadedWords);
            } catch (IOException e) {
                System.out.println("Lỗi khi đọc file " + file.getName() + ": " + e.getMessage());
            }
        }
        return loadedWords;
    }

    private void parseSingleFile(BufferedReader reader, List<Word> loadedWords) throws IOException {
        String line;
        Word currentWord = null;
        GrammarDefinition currentGrammarDef = null;
        DefinitionType currentType = null;

        while ((line = reader.readLine()) != null) {
            line = line.trim();
            if (line.isEmpty()) continue;

            if (line.startsWith("@")) {
                currentWord = new Word(line.substring(1).trim());
                loadedWords.add(currentWord);
                currentGrammarDef = null;
                currentType = null;
                continue;
            }

            if (currentWord == null) continue;

            if (line.startsWith("/") && line.endsWith("/")) {
                currentWord.addDefinition(DefinitionFactory.createDefinition(
                        DefinitionType.PRONUNCIATION, line.substring(1, line.length() - 1).trim()));
                currentGrammarDef = null;
            }
            else if (line.startsWith("- ")) {
                currentWord.addDefinition(DefinitionFactory.createDefinition(
                        DefinitionType.SYNONYM, line.substring(2).trim()));
                currentGrammarDef = null;
            }
            else if (line.startsWith("* ")) {
                currentType = switch (line.substring(2).trim()) {
                    case "Danh từ" -> DefinitionType.NOUN;
                    case "Động từ" -> DefinitionType.VERB;
                    case "Tính từ" -> DefinitionType.ADJECTIVE;
                    default -> null;
                };
                currentGrammarDef = null;
            }
            else if (line.startsWith("_ ") && currentType != null) {
                currentGrammarDef = (GrammarDefinition) DefinitionFactory.createDefinition(
                        currentType, line.substring(2).trim());
                currentWord.addDefinition(currentGrammarDef);
            }
            else if (line.startsWith("= ") && currentGrammarDef != null && line.contains(" + ")) {
                String[] parts = line.substring(2).trim().split(" \\+ ", 2);
                currentGrammarDef.addSentence(new Sentence(parts[0].trim(), parts[1].trim()));
            }
        }
    }
}