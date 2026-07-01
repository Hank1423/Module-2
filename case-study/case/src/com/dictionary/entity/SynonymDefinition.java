package com.dictionary.entity;

public class SynonymDefinition extends Definition{
    public SynonymDefinition(String content){
        super(DefinitionType.SYNONYM, content);
    }

    @Override
    public String formatToString(){
        return "- " + content;
    }
}
