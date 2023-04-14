package com.masai.demo;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class Demo {
	
	
	   @GetMapping("/hello/{roll}")
	  // @RequestMapping(value = "/hello" ,produces = MediaType.APPLICATION_JSON_VALUE)
       public ResponseEntity<Student> getStudent(@PathVariable("roll")  Integer roll,@RequestParam(value = "name",required = false)  String name ,@RequestParam("addr")  String add) {
    	   Student s=new Student();
    	   s.setName(name);
    	   s.setRoll(roll);
    	   s.setAddr(add);
    	   return new ResponseEntity<>(s,HttpStatus.OK);
       }
	   
	   
	   @PostMapping("/hello")
	       public ResponseEntity<Student> poststudent(@Valid @RequestBody Student st ) {
		   Student s=new Student();
    	   s.setName(st.name);
    	   s.setRoll(st.getRoll());
    	   s.setAddr(st.getAddr()+" Gujrat");
    	   
    	   
    	  HttpHeaders hh=new HttpHeaders();
    	  hh.add("hello", s+"");
	    	   return new ResponseEntity<>(st,hh,HttpStatus.OK);
	       }
	   
	   @GetMapping("/get/{roll}")
	   public ResponseEntity<String> getName(@PathVariable Integer roll){
		    
		   if(roll<0) {
			   throw new IllegalArgumentException("not valid roll");
		   }
		   return new ResponseEntity<String>("Youpp valid roll :"+roll,HttpStatus.OK);
	   }
	   
	   
	   
	   
}
