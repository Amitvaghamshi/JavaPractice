package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.masai.model.Employee;
import com.masai.model.EmployeeDto;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	   public Employee findByEmail(String email);
	   @Query("select  new com.masai.model.EmployeeDto(e.name ,e.gendar ,e.addresses) from Employee e where e.id =:eid")
	   public EmployeeDto getEmpDto(@Param("eid") Integer id);
}
