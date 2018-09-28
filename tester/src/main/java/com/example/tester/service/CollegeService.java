package com.example.tester.service;

import com.example.tester.model.College;
import com.example.tester.repository.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeService {

    @Autowired
    CollegeRepository collegeRepository;

    public List<College> getAllCollege(){
        return collegeRepository.findAll();
    }

    public College addCollege(College college){
        return collegeRepository.save(college);
    }

    public College getCollegeById(Long collegeId){
        return collegeRepository.findCollegeByCollegeId(collegeId);
    }

 }
