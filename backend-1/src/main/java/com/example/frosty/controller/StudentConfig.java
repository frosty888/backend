package com.example.frosty.controller;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.frosty.student.Student;

@Configuration
public class StudentConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args -> {
			Student ervin = new Student(
					"ervin",
					"asdsd@gmail.com",
					LocalDate.of(2000, Month.AUGUST, 6),
					22);
			repository.saveAll(
					List.of(ervin)
					);
		};
	}
}
