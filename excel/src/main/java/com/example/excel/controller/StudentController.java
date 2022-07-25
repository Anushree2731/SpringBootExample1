package com.example.excel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.excel.pojo.Student;
import com.example.excel.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	
	@Autowired
	private StudentService studentService;
	
	
	@PostMapping("/savethedata")
	public void saveData(Student student) {
		student.setName("anushree");
		student.setAddress("Ramnagar, Karnataka");
		student.setEmail("anushree.ar@gmail.com");
		student.setId("3456");
		studentService.saveData(student);
		
	}	
	
	

	
	@GetMapping("/getData")
	public Student getData(Student student) {
	
		return studentService.getData(student);
		
	}
}
