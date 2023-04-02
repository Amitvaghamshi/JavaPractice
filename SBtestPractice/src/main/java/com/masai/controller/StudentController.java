package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Student;
import com.masai.service.StudentService;

@RestController
public class StudentController {

	    @Autowired
	    private StudentService sr;
	  
	   @GetMapping(value = "/students")
	   public ResponseEntity<List<Student>> getAllHandler(){
		      List<Student> lis=sr.getAllStudent();
		      
		      return new ResponseEntity<>(lis,HttpStatus.OK);
	   }
}
