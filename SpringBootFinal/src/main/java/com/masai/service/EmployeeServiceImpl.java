package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Employee;
import com.masai.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	
	  @Autowired
	  private EmployeeRepository emprepo;
	  
	  

	@Override
	public Employee addEmp(Employee e) {
	
	     return emprepo.save(e);	
		
	}

}
