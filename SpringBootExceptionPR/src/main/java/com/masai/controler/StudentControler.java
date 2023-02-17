package com.masai.controler;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Student;

@RestController
public class StudentControler{
     
	  @PostMapping("/students")
	  public ResponseEntity<Student> StudenetData(@RequestBody Student st){
		  
		  
		  HttpHeaders hh=new HttpHeaders();
		  hh.add("Ok", "Accepted");
		  
		  ResponseEntity<Student> re=new ResponseEntity<>(st,hh,HttpStatus.ACCEPTED);
		  
		  return re;
		  
	  }
}
