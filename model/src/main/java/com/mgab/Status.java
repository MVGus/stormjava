package com.mgab;

public enum Status {
    ACTIVE("Доступный вопрос"), IN_PROGRESS("Открытый вопрос"), CLOSED("Закрытый вопрос");

    private String name;

    Status(String s) {
        this.name = s;
    }

    public String getName() {
        return name;
    }
}
