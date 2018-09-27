package com.example.tester.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "college")
public class College {

    @Id
    private long collegeId;

    private String collegeName;

    public College(){

    }

    public long getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(long collegeId) {
        this.collegeId = collegeId;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }



}
