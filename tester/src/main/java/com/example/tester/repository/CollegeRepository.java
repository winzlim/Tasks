package com.example.tester.repository;

import com.example.tester.model.College;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeRepository extends JpaRepository<College, Long> {
    College findCollegeByCollegeId(Long collegeId);

}
