package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Student;
import com.masai.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService stuentService; 
	  
	@PostMapping("/students")
	public ResponseEntity<Student> saveStudentDetailsHandler(@RequestBody Student student){
		
		
		Student savedStudent= stuentService.saveStudent(student);
		
		return new ResponseEntity<>(savedStudent,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudentHandler() {
		
		List<Student> li= stuentService.getAllStudent();
		return new ResponseEntity<List<Student>>(li,HttpStatus.OK);
	}
	
	@GetMapping("/students/{roll}")
	public ResponseEntity<Student> getSingleStudent(@PathVariable("roll") Integer roll) {
		  
		return new ResponseEntity<>(stuentService.findStudentByRoll(roll),HttpStatus.OK);
	}
	
	@PutMapping("/students")
	public ResponseEntity<Student> updateStudentHandler(@RequestBody Student st){
		         Student s= stuentService.updateStudent(st);
		         
		         return new ResponseEntity<>(s,HttpStatus.ACCEPTED);
	}
	
}
