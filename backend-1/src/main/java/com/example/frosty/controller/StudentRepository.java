package com.example.frosty.controller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.frosty.student.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
