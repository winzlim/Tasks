package com.example.tester.repository;

import com.example.tester.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findStudentByStudentId(Long studentId);


    @Query(value = "SELECT s.* FROM STUDENT s JOIN COURSE c " +
            "ON s.STUDENT_ID=c.STUDENT_ID JOIN COLLEGE ce " +
            "ON c.COLLEGE_ID=ce.COLLEGE_ID " +
            "WHERE ce.COLLEGE_ID = :collegeId",
            nativeQuery = true
    )
    List<Student> findByCollegeId(@Param("collegeId") Long collegeId);
}

