package com.beyond_h.ota.week04;

public enum EnumInstanceCreater {
    INSTANCE;
    private StudentService instance;
    EnumInstanceCreater() {
        instance = new StudentService();
    }

    public StudentService getInstance() {
        return instance;
    }
}



