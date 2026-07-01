package com.dictionary.entity;

import java.util.ArrayList;
import java.util.List;

public class GrammarDefinition extends Definition{
    private final List<Sentence> sentences;

    public GrammarDefinition(DefinitionType type, String content) {
        super(type, content);
        this.sentences = new ArrayList<>();
    }

    public void addSentence(Sentence sentence){
        this.sentences.add(sentence);
    }

    @Override
    public String formatToString(){
        StringBuilder sb = new StringBuilder();

        String typeName = switch(type){
            case NOUN -> "Danh từ";
            case VERB -> "Động từ";
            case ADJECTIVE -> "Tính từ";
            default ->  type.name();
        };

        sb.append("* ").append(typeName).append("\n");
        sb.append("_ ").append(content);

        for (Sentence s : sentences) {
            sb.append("\n= ").append(s.getText()).append(" + ").append(s.getMeaning());
        }
        return sb.toString();
    }
}
