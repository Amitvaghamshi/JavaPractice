package com.masai.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Employee;
import com.masai.service.EmployeeService;

@RestController
public class EmpController {

	@Autowired
	private EmployeeService empservice;
	
	@PostMapping("/emp")
	public ResponseEntity<Employee> AddEmp(@RequestBody Employee e) {
		
		  Employee es=empservice.AddEmp(e);
		  return new ResponseEntity<Employee>(es,HttpStatus.CREATED);
	}
	
	@GetMapping("emp/{id}")
	public ResponseEntity<Employee> getEmp(@PathVariable Integer id) {
		
		  Employee es=empservice.getEmp(id);
		  return new ResponseEntity<Employee>(es,HttpStatus.CREATED);
	}
}
