package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.model.EmployeeDto;
import com.masai.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService empservice;
	
	@PostMapping("/employee")
	public ResponseEntity<Employee> addEmployeeHandler(@RequestBody Employee emp) throws EmployeeException{
		 Employee e=   empservice.addEmployee(emp);
		 return new ResponseEntity<Employee>(e,HttpStatus.CREATED);
		 
	}
	
	@GetMapping("/employee")
	public ResponseEntity<Employee> addEmployeeByIDHandler(@RequestParam("id") Integer id) throws EmployeeException{
		 Employee e=   empservice.getEmployeeByID(id);
		 return new ResponseEntity<Employee>(e,HttpStatus.CREATED); 
	}
	
	@PutMapping("/employee")
	public ResponseEntity<String> assignDept(@RequestParam("id") Integer id,@RequestParam("dept") Integer deptid) throws EmployeeException{
	     String str=  empservice.AssignDepartment(id, deptid);
		 return new ResponseEntity<>(str,HttpStatus.CREATED); 
	}
	
	@GetMapping("/employee/dto")
	public ResponseEntity<EmployeeDto> getempdto(@RequestParam("id") Integer id) throws EmployeeException{
		 EmployeeDto e=   empservice.getEmpDto(id);
		 return new ResponseEntity<EmployeeDto>(e,HttpStatus.CREATED); 
	}
	
}
