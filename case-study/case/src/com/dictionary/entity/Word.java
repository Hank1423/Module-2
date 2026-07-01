package com.dictionary.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Word {
    private final String keyword;
    private final List<Definition> definitions;

    public Word(String keyword){
        this.keyword = keyword;
        this.definitions = new ArrayList<>();
    }

    public String getKeyword(){
        return keyword;
    }

    public List<Definition> getDefinitions(){
        return Collections.unmodifiableList(this.definitions);
    }

    public void addDefinition(Definition definition){
        if (definition != null && !this.definitions.contains(definition)){
            this.definitions.add(definition);
        }
    }
}
