package com.dictionary.entity;

public abstract class Definition {
    protected final DefinitionType type;
    protected final String content;

    public Definition(DefinitionType type, String content){
        this.type = type;
        this.content = content;
    }

    public DefinitionType getType(){
        return type;
    }

    public String getContent(){
        return content;
    }

    public abstract String formatToString();
}
