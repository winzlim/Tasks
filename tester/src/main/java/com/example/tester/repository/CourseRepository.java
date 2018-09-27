package com.example.tester.repository;

import com.example.tester.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long>{

    public List<Course> findByStudentId(Long studentId);

}
