package com.dictionary.entity;

public class Sentence {
    private final String text;
    private final String meaning;

    public Sentence(String text, String meaning){
        this.text = text;
        this.meaning = meaning;
    }

    public String getText(){
        return text;
    }

    public String getMeaning(){
        return meaning;
    }
}
