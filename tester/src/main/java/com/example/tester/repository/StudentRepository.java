package com.example.tester.repository;

import com.example.tester.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    public Student findStudentByStudentId(Long studentId);
}
