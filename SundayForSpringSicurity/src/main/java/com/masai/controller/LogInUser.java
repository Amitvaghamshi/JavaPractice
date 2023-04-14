package com.masai.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Student;
import com.masai.repository.StudentRepository;

@RestController
public class LogInUser {
	
	@Autowired
	private StudentRepository studentrepo;

	@GetMapping("/signIn")
	public ResponseEntity<Student> loginHandler(Authentication auth){
		
		System.out.println(auth.getName());
		System.out.println(auth.getCredentials());
		
		Optional<Student> st=studentrepo.findByEmail(auth.getName());
		
		return new ResponseEntity<Student>(st.get(),HttpStatus.OK);
		
	}
}
