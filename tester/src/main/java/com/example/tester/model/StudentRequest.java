package com.example.tester.model;

import java.io.Serializable;

public class StudentRequest implements Serializable {

      private String studentName;

    public StudentRequest() {
    }

    public StudentRequest(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
