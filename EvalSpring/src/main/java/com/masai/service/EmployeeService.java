package com.masai.service;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.model.EmployeeDto;

public interface EmployeeService {

	  public Employee addEmployee(Employee e) throws EmployeeException;
	  public Employee getEmployeeByID(Integer id) throws EmployeeException;
	  public String AssignDepartment(Integer empid,Integer deptId);
	  public EmployeeDto getEmpDto(Integer id);
}
