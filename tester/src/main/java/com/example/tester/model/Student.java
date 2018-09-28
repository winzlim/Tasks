package com.example.tester.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studentId;

    private String studentName;

    @OneToMany(mappedBy = "student")
    private Set<Course> courses;

    private String collegeName;

    public Student() {
    }

    public Student(Long studentId){
        this.studentId = studentId;
     }

    public Student(Long studentId, String studentName, Set<Course> courses) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.courses = courses;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }


    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
}


