package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Department;
import com.masai.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	private DepartmentRepository deptrepo;

	@Override
	public Department addDepartment(Department dept) {
		return deptrepo.save(dept); 
	}

	
}
