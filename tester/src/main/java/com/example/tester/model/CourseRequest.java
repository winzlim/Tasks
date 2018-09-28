package com.example.tester.model;

import java.io.Serializable;

public class CourseRequest implements Serializable {

    private String courseName;
    private String courseCode;

    public CourseRequest() {
    }

    public CourseRequest(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
