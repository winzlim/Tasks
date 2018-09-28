package com.example.tester.controller;

import com.example.tester.exception.ResourceNotFoundException;
import com.example.tester.model.College;
import com.example.tester.model.Course;
import com.example.tester.model.CourseRequest;
import com.example.tester.model.Student;
import com.example.tester.service.CollegeService;
import com.example.tester.service.CourseService;
import com.example.tester.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @Autowired
    private StudentService studentService;

    @Autowired
    private CollegeService collegeService;

    @RequestMapping(method = RequestMethod.GET ,value = "/courses")
    public List<Course> getAllCourse(){
        return courseService.getAllCourse();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/students/{studentId}/colleges/{collegeId}/courses")
    public Course addStudent(@PathVariable Long studentId, @PathVariable Long collegeId, @RequestBody CourseRequest courseRequest){
        Student student = studentService.getStudentById(studentId);
        College college = collegeService.getCollegeById(collegeId);

        if(student.getStudentId()!=null && college.getCollegeId()!=null){
            if(student.getCollegeName()==null){
                student.setCollegeName(college.getCollegeName());
            }
            Course course = new Course(courseRequest.getCourseName(), courseRequest.getCourseCode(), student, college);
            return courseService.addCourse(course);
        }else{
            throw new ResourceNotFoundException("Id not found");
        }

    }

}
