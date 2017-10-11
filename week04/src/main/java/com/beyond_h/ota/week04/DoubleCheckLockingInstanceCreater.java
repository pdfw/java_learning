package com.beyond_h.ota.week04;

import com.beyond_h.ota.week04.model.Student;

public class DoubleCheckLockingInstanceCreater {
    private static StudentService instance;
    public static StudentService getInstance() {
        if (instance == null) {
            synchronized (StudentService.class) {
                StudentService temp = instance;
                if (temp == null) {
                    synchronized (StudentService.class) {
                        temp = new StudentService();
                    }
                    instance = temp;
                }
            }
        }
        return instance;
    }
}



