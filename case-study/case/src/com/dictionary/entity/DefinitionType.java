package com.dictionary.entity;

public enum DefinitionType {
    PRONUNCIATION("-p", "--pronoun"),
    NOUN("-n", "--noun"),
    VERB("-v", "--verb"),
    ADJECTIVE("-a", "--adjective"),
    SYNONYM("-s", "--synonymous");

    private final String shortFlag;
    private final String longFlag;
    DefinitionType(String shortFlag, String longFlag){
        this.shortFlag = shortFlag;
        this.longFlag = longFlag;
    }

    public static DefinitionType fromFlag(String flag){
        for (DefinitionType type : values()){
            if (type.shortFlag.equalsIgnoreCase(flag) || type.longFlag.equalsIgnoreCase(flag)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Loại định nghĩa '" + flag + "' không hợp lệ!");
    }
}
