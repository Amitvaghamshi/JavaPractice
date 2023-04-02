package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
