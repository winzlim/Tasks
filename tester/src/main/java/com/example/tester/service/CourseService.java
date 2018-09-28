package com.example.tester.service;

import com.example.tester.model.College;
import com.example.tester.model.Course;
import com.example.tester.model.Student;
import com.example.tester.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public List<Course> getAllCourse(){
        return courseRepository.findAll();
    }

    public Course addCourse(Course course){
        return courseRepository.save(course);
    }

    public Course getCourseById(Long courseId){
        return courseRepository.findCourseByCourseId(courseId);
    }



}
