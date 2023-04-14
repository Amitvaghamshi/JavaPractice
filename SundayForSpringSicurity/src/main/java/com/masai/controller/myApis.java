package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Student;
import com.masai.service.StudentService;

@RestController
public class myApis {

	@Autowired
	private PasswordEncoder encoder;
	
	@Autowired
	private StudentService studentservice;
	
	@GetMapping("/helloadmin")
	public ResponseEntity<String> SayHello(){
		  return new ResponseEntity<String>("hello world",HttpStatus.OK);
	}
	
	@GetMapping("/hellouser")
	public ResponseEntity<String> getdata(){
		return new ResponseEntity<String>("<h1> Hello world @ </h1>",HttpStatus.OK);
	}
	
	@PostMapping("/register")
	public ResponseEntity<Student> ragister(@RequestBody Student st) {
		st.setPassword(encoder.encode(st.getPassword()));
		
		Student s=studentservice.ragisterStudent(st);
		
		return new ResponseEntity<Student>(s,HttpStatus.CREATED);
	}
}
