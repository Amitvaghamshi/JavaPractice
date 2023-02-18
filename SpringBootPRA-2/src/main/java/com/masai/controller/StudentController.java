package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Student;
import com.masai.model.StudentDto;
import com.masai.service.StudentService;

import jakarta.persistence.criteria.CriteriaBuilder.In;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService stuservice;

	@PostMapping(value =  "/student",consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Student> addStudent(@RequestBody Student s){
		
		Student actstudent = stuservice.addStudent(s);
		
		return new ResponseEntity<>(actstudent,HttpStatus.CREATED);
		  
	}
	
	
	@GetMapping("/student/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable("id") Integer id) {
		   Student s= stuservice.findStudentById(id);
		   
		   return new ResponseEntity<Student>(s,HttpStatus.ACCEPTED);
	}
	
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudent() {
		   List<Student> s= stuservice.findAllStudent();
		   
		   return new ResponseEntity<>(s,HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/student")
	public ResponseEntity<Student> updateStudent(@RequestBody Student s) {
		  
		Student stu= stuservice.updateStudent(s);
		
		return new ResponseEntity<>(stu,HttpStatus.OK);
	}
	
	
	@GetMapping("/find/{st}")
	public ResponseEntity<Student> generalSearch(@PathVariable("st") Integer name) {
		   Student sp= stuservice.findByName(name);
		   return new ResponseEntity<>(sp,HttpStatus.OK);
	}
	
	@GetMapping("/find/{n}/{m}")
	public ResponseEntity<Student> generalSearch(@PathVariable("n") String name, @PathVariable("m") Integer marks) {
		   Student sp= stuservice.findByNameAndmk(marks, name);
		   return new ResponseEntity<>(sp,HttpStatus.OK);
	}
	 
	@GetMapping("str/{roll}")
	public ResponseEntity<List<String>> getnames(@PathVariable("roll") Integer roll){
		List<String> lis= stuservice.findnamesOfstudent(roll);
		
		return new ResponseEntity<List<String>>(lis,HttpStatus.OK);
	}
	
	
	@GetMapping("/sts/{m}")
	public ResponseEntity<List<StudentDto>> getallsts(@PathVariable("m") Integer marks){
		  
		   List<StudentDto> dtos=stuservice.getnameandroll(marks);
		   
		   return new ResponseEntity<List<StudentDto>>(dtos,HttpStatus.OK);
	}
}
