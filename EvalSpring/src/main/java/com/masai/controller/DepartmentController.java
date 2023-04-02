package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Department;
import com.masai.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	  private DepartmentService deptservice;
	
	@PostMapping("/department")
	public ResponseEntity<Department> addDept(@RequestBody Department dept){
		
		     Department d=deptservice.addDepartment(dept);
		     
		     return new ResponseEntity<>(d,HttpStatus.CREATED);
	}
}
