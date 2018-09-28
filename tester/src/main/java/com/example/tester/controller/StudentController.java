package com.example.tester.controller;

import com.example.tester.exception.ResourceNotFoundException;
import com.example.tester.model.Student;
import com.example.tester.model.StudentRequest;
import com.example.tester.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET ,value = "/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/students")
    public Student addStudent(@RequestBody StudentRequest studentRequest){
        Student student = new Student();
        student.setStudentName(studentRequest.getStudentName());
        return studentService.addStudent(student);
    }

    @RequestMapping(method = RequestMethod.GET ,value = "/students/{studentId}")
    public Student getStudentById(@PathVariable Long studentId){
        Student student = studentService.getStudentById(studentId);
        if(student!=null){
            return student;
        }else{
            throw new ResourceNotFoundException("Student ID: "+studentId+" not found");
        }

    }



}
