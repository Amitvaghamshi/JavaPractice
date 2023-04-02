package com.masai.service;

import java.util.List;

import com.masai.model.Student;

public interface StudentService {
   
	public List<Student> getAllst();
	public Student addStudent(Student st);
}
