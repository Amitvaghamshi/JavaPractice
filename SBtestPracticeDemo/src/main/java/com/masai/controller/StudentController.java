package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Student;
import com.masai.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	   private StudentService sr;

	  @GetMapping(value = "/students")
	  public ResponseEntity<List<Student>> getAll(){
		      List<Student> lis=sr.getAllst();
		      
		      return new ResponseEntity<List<Student>>(lis,HttpStatus.OK);
	  }
	  
	  @PostMapping(value = "/student")
	  public ResponseEntity<Student> addst(@RequestBody Student st){
		    Student s=sr.addStudent(st);
		      
		      return new ResponseEntity<Student>(s,HttpStatus.OK);
	  }
}
