package com.dictionary.controller;

import com.dictionary.entity.*;
import com.dictionary.factory.DefinitionFactory;
import com.dictionary.service.DictionaryService;
import java.util.*;

public class DictionaryController {
    private final Map<String, CommandHandler> commandMap;
    private final DictionaryService service;

    public DictionaryController() {
        this.service = DictionaryService.getInstance();
        this.commandMap = new HashMap<>();

        // Đăng ký các action vào Map (Xóa bỏ hoàn toàn cấu trúc rẽ nhánh if/case)
        commandMap.put("lookup", this::handleLookup);
        commandMap.put("define", this::handleDefine);
        commandMap.put("drop", this::handleDrop);
        commandMap.put("export", this::handleExport);
    }

    public void processRequest(String rawInput) {
        Request request = parseInput(rawInput);
        if (request == null) {
            System.out.println("Lệnh không hợp lệ! Vui lòng thử lại.");
            return;
        }

        CommandHandler handler = commandMap.get(request.getAction());
        if (handler != null) {
            handler.execute(request);
        } else {
            System.out.println("Hành động '" + request.getAction() + "' không được hỗ trợ!");
        }
    }

    private Request parseInput(String input) {
        String[] tokens = input.trim().split("\\s+");
        if (tokens.length < 2) return null;

        String action = tokens[0].toLowerCase();
        String keyword;
        List<String> paramsList = new ArrayList<>();

        if (action.equals("define")) {
            keyword = tokens[tokens.length - 1];
            for (int i = 1; i < tokens.length - 1; i++) {
                paramsList.add(tokens[i]);
            }
        } else {
            keyword = tokens[1];
            for (int i = 2; i < tokens.length; i++) {
                paramsList.add(tokens[i]);
            }
        }
        return new Request(action, keyword, paramsList);
    }

    private void handleLookup(Request req) {
        Word word = service.lookup(req.getKeyword());
        if (word == null) {
            System.out.println("@" + req.getKeyword() + " không tồn tại trong từ điển.");
            return;
        }
        System.out.println("@" + word.getKeyword());
        for (Definition def : word.getDefinitions()) {
            System.out.println(def.formatToString());
        }
    }

    private void handleDefine(Request req) {
        if (req.getParams().isEmpty()) {
            System.out.println("Thiếu loại định nghĩa! (Ví dụ: -a, -n...)");
            return;
        }

        try {
            DefinitionType type = DefinitionType.fromFlag(req.getParams().get(0));
            Word word = service.lookup(req.getKeyword());
            if (word == null) {
                System.out.println("@" + req.getKeyword() + " is not existed in database, created new one!");
                word = service.createOrGetWord(req.getKeyword());
            }
            Scanner sc = new Scanner(System.in);
            System.out.print(type.name() + " definition: ");
            String content = sc.nextLine();

            for (Definition def : word.getDefinitions()) {
                if (def.getType() == type && def.getContent().equalsIgnoreCase(content.trim())) {
                    System.out.println("Định nghĩa này đã tồn tại cho từ @" + word.getKeyword() + "!");
                    return;
                }
            }

            Definition def = DefinitionFactory.createDefinition(type, content);

            if (def instanceof GrammarDefinition gd) {
                System.out.print("Sentence: ");
                String sentenceText = sc.nextLine();
                if (!sentenceText.isBlank()) {
                    System.out.print("Sentence's meaning: ");
                    String meaning = sc.nextLine();
                    gd.addSentence(new Sentence(sentenceText, meaning));
                }
            }

            word.addDefinition(def);
            service.saveWord(word);
            System.out.println("Saved!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private void handleDrop(Request req) {
        boolean deleted = service.drop(req.getKeyword());
        if (deleted) {
            System.out.println("@" + req.getKeyword() + " dropped!");
        } else {
            System.out.println("@" + req.getKeyword() + " không tồn tại để xóa.");
        }
    }

    private void handleExport(Request req) {
        System.out.print("Exporting ");
        for (int i = 10; i <= 100; i += 10) {
            try { Thread.sleep(80); } catch (InterruptedException ignored) {}
            System.out.print(i == 100 ? "Done!\n" : i + "%..");
        }
    }
}