package com.dictionary.service;

import com.dictionary.entity.Word;
import com.dictionary.repository.DictionaryRepository;
import java.util.*;

public class DictionaryService {
    private static DictionaryService instance;
    private final Map<String, Word> wordMap;
    private final List<Word> wordList;
    private final DictionaryRepository repository;

    private DictionaryService(){
        this.wordMap = new HashMap<>();
        this.wordList = new LinkedList<>();
        this.repository = new DictionaryRepository();

        List<Word> loadedWords = repository.loadAllWordsFromStorage();
        for (Word word : loadedWords) {
            String key = word.getKeyword().toLowerCase();

            if (wordMap.containsKey(key)){
                continue;
            }

            this.wordMap.put(key, word);

            int index = Collections.binarySearch(wordList, word,
                    (w1, w2) -> w1.getKeyword().compareToIgnoreCase(w2.getKeyword()));
            if(index < 0){
                index = -(index + 1);
            }
            wordList.add(index, word);
        }
    }

    public static synchronized DictionaryService getInstance(){
        if(instance == null){
            instance = new DictionaryService();
        }
        return instance;
    }

    public Word lookup(String keyword){
        if(keyword == null) {
            return null;
        }
        return wordMap.get(keyword);
    }

    public Word createOrGetWord(String keyword){
        if(keyword == null) {
            return null;
        }

        if(wordMap.containsKey(keyword)){
            return wordMap.get(keyword);
        }

        Word newWord = new Word(keyword);
        wordMap.put(keyword, newWord);

        int index = Collections.binarySearch(wordList, newWord,
                (w1, w2) -> w1.getKeyword().compareToIgnoreCase(w2.getKeyword()));
        if(index < 0){
            index = -(index + 1);
        }
        wordList.add(index, newWord);
        return newWord;
    }

    public void saveWord(Word word){
        repository.saveWordToFile(word);
    }

    public boolean drop(String keyword){
        if(keyword == null) {
            return false;
        }

        if(wordMap.containsKey(keyword)){
            Word removedWord = wordMap.remove(keyword);
            wordList.remove(removedWord);
            repository.deleteWordFile(keyword);
            return true;
        }
        return false;
    }

    public List<Word> getAllWords(){
        return Collections.unmodifiableList(this.wordList);
    }
}