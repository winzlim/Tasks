package com.example.tester.model;

import java.io.Serializable;

public class CollegeRequest implements Serializable{

    private String collegeName;
    private String collegeAddress;

    public CollegeRequest() {
    }

    public CollegeRequest(String collegeName, String collegeAddress) {
        this.collegeName = collegeName;
        this.collegeAddress = collegeAddress;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCollegeAddress() {
        return collegeAddress;
    }

    public void setCollegeAddress(String collegeAddress) {
        this.collegeAddress = collegeAddress;
    }
}
