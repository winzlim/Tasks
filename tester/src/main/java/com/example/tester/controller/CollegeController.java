package com.example.tester.controller;

import com.example.tester.exception.ResourceNotFoundException;
import com.example.tester.model.College;
import com.example.tester.model.CollegeRequest;
import com.example.tester.model.Course;
import com.example.tester.model.Student;
import com.example.tester.repository.CollegeRepository;
import com.example.tester.service.CollegeService;
import com.example.tester.service.CourseService;
import com.example.tester.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CollegeController {

    @Autowired
    private CollegeService collegeService;

    @Autowired
    private CourseService courseService;

    @Autowired
    StudentService studentService;

    @RequestMapping(method = RequestMethod.GET ,value = "/colleges")
    public List<College> getAllCollege(){
        return collegeService.getAllCollege();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/colleges")
    public College addCollege(@RequestBody CollegeRequest collegeRequest){
        College college = new College(collegeRequest.getCollegeName(), collegeRequest.getCollegeAddress());
        return collegeService.addCollege(college);
    }

    @RequestMapping(method = RequestMethod.GET ,value = "/colleges/{collegeId}/students")
    public List<Student> getStudentByCollegeId(@PathVariable Long collegeId){
        return studentService.getStudentByCollegeId(collegeId);
    }

}
