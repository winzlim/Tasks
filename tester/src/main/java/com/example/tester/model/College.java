package com.example.tester.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "college")
public class College {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long collegeId;

    @OneToMany(mappedBy = "college")
    private Set<Course> courses;

    private String collegeName;
    private String collegeAddress;

    public College(){

    }

    public College(Set<Course> courses, String collegeName, String collegeAddress) {
        this.courses = courses;
        this.collegeName = collegeName;
        this.collegeAddress = collegeAddress;
    }

    public College(String collegeName, String collegeAddress) {
        this.collegeName = collegeName;
        this.collegeAddress = collegeAddress;
    }

    public String getCollegeAddress() {
        return collegeAddress;
    }

    public void setCollegeAddress(String collegeAddress) {
        this.collegeAddress = collegeAddress;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    public Long getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Long collegeId) {
        this.collegeId = collegeId;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
}
