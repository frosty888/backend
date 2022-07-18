package com.example.frosty.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.frosty.student.Student;

@Service
public class StudentService {
	
	private final StudentRepository studentRepository;
	
	@Autowired
	public StudentService(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	
	public List<Student> getAllStudents(){
		
		return studentRepository.findAll();
	}
}
