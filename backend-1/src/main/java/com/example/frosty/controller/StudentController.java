package com.example.frosty.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.frosty.student.Student;


@RestController
@RequestMapping(path= "api/v1/student")
public class StudentController {
	
	private final StudentService studentService;
	
	
	@Autowired
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	@GetMapping
	public List<Student> listStudents(){
		return studentService.getAllStudents();		
	}
}
