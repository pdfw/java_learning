package com.beyond_h.ota.week04;

import com.beyond_h.ota.week04.model.Student;

public class StudentService {
    public void PrintStudent(){
        Student order = Student.builder().studentId("001").studentName("尼古拉斯赵四").build();
        System.out.println("student id:" + order.getStudentId() + "; student name:" + order.getStudentName());
    }
}