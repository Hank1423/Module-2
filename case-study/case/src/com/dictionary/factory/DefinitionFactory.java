package com.dictionary.factory;

import com.dictionary.entity.*;

public class DefinitionFactory {
    public static Definition createDefinition(DefinitionType type, String content){
        return switch(type){
            case PRONUNCIATION -> new PronunciationDefinition(content);
            case SYNONYM -> new SynonymDefinition(content);
            case NOUN, VERB, ADJECTIVE -> new GrammarDefinition(type, content);
        };
    }
}
