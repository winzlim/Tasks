package com.example.tester.service;

import com.example.tester.model.Student;
import com.example.tester.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Student addStudent(Student student){
        return studentRepository.save(student);
    }

    public Student getStudentById(Long id) {
        return studentRepository.findStudentByStudentId(id);
    }

}
