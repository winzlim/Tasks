package com.example.tester.controller;

import com.example.tester.model.Student;
import com.example.tester.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
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
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @RequestMapping(method = RequestMethod.GET ,value = "/students/{studentId}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long studentId){
        Student student = studentService.getStudentById(studentId);
        Student noStudent = null;
        if(student != null){
            return new ResponseEntity<>(studentService.getStudentById(studentId), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(noStudent, HttpStatus.NOT_FOUND);
        }

    }



}
