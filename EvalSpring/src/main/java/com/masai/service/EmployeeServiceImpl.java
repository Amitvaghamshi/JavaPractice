package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.EmployeeException;
import com.masai.model.Department;
import com.masai.model.Employee;
import com.masai.model.EmployeeDto;
import com.masai.repository.DepartmentRepository;
import com.masai.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository emprepo;
	
	@Autowired
	private DepartmentRepository deptrepo;

	@Override
	public Employee addEmployee(Employee e) throws EmployeeException {
		  return emprepo.save(e);
	}

	@Override
	public Employee getEmployeeByID(Integer id) throws EmployeeException {
		  return emprepo.findById(id).orElseThrow(()->new EmployeeException("Not foubd"));
	}

	@Override
	public String AssignDepartment(Integer empid, Integer deptId) {
		  
		Employee e=emprepo.findById(empid).get();
		
		Department d=deptrepo.findById(deptId).get();
		
		System.out.println(e);
		System.out.println(d);
		
		d.getEmployees().add(e);
		e.setDept(d);
		emprepo.save(e);
		deptrepo.save(d);
		
		
		return "added";
	}

	@Override
	public EmployeeDto getEmpDto(Integer id) {
		  EmployeeDto dto=emprepo.getEmpDto(id);
		  return dto;
	}

}
