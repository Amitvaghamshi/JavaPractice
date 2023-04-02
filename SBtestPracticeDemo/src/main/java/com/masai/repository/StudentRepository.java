package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
