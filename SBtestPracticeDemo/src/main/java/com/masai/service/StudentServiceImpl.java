package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Student;
import com.masai.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	  @Autowired
	  private StudentRepository strepo;

	@Override
	public List<Student> getAllst() {
		return strepo.findAll();
	}

	@Override
	public Student addStudent(Student st) {
		   return strepo.save(st);
	}
	  
	  
	  
}

