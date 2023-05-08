package com.masai.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Employee;
import com.masai.service.EmployeeServiceImpl;

@RestController

public class EmployeeController {

	   @Autowired
	    private EmployeeServiceImpl empservice;
	   
	   
	   @RequestMapping(value =  "/emps",produces = MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.POST)
	   public ResponseEntity<Employee>  addEmployee(@RequestBody Employee e) {
		   
		     Employee es=empservice.addEmp(e);
		     
		   HttpHeaders hh=new HttpHeaders();
		   hh.add("Hii", "amit");
		   
		   
		     return new ResponseEntity<Employee>(es,hh,HttpStatus.CREATED);
		   
	   }
	   
	   
	   @GetMapping("/demos")
	   public String DemoHandler(@RequestParam("name") String name,@RequestParam("roll") Integer roll) {
		   
		   System.out.println();
		   return name+" "+roll;
		   
	   }

	   
	   @ExceptionHandler(IllegalArgumentException.class)
		public ResponseEntity<String> myExpHandler(IllegalArgumentException ie)  {
			System.out.println("inside myHandler method...");
			
		
		 return new ResponseEntity<String>(ie.getMessage(),HttpStatus.BAD_REQUEST);
	   }
}
