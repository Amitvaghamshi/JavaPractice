package com.masai;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;
import jakarta.validation.Valid;

@RestController
public class StudentControler {
	
	List<Student> sts=new ArrayList<>();
	
	@PostConstruct
	public void Init() {
		  sts.add(new Student(1,"amit",LocalDate.of(2000, 9, 12),"dhari"));
		  sts.add(new Student(2,"ashish",LocalDate.of(2000, 9, 12),"amreli"));
		  sts.add(new Student(3,"kaushal",LocalDate.of(2000, 9, 12),"keral"));
	}

	  @PostMapping("/students")
	  public ResponseEntity<Student> getSt(@Valid @RequestBody Student st){
		  
		  
		  System.out.println(st);
		  
		  HttpHeaders hh=new HttpHeaders();
		  hh.add("OK", "Accepted");
		  
		  ResponseEntity<Student> rc=new ResponseEntity<Student>(st,hh,HttpStatus.ACCEPTED);
		  
		  return rc;
	  }
	  
	  
	  @GetMapping("/students/{roll}")
	  public ResponseEntity<Student> getStudents(@PathVariable("roll") Integer roll) {
		  
		  Student s=null;
		  
		  for(int i=0;i<sts.size();i++) {
			    if(sts.get(i).getRoll()==roll) {
			    	s=sts.get(i);
			    }
		  }
		  
		  if(s==null) {
			  throw new IllegalArgumentException("Not found");
		  }
		  
		  return new ResponseEntity<Student>(s,HttpStatus.OK);
		  
	  }
	  
	 
	  
}
