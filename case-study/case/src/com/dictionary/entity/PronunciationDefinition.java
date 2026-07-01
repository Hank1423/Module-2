package com.dictionary.entity;

public class PronunciationDefinition extends Definition{
    public PronunciationDefinition(String content){
        super(DefinitionType.PRONUNCIATION, content);
    }

    @Override
    public String formatToString(){
        return "/" + content + "/";
    }
}
