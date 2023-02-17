package com.masai.service;

import java.util.List;

import com.masai.model.Student;

public interface StudentService {

	public Student saveStudent(Student st);
	public List<Student> getAllStudent();
	public Student findStudentByRoll(Integer roll);
	public Student updateStudent(Student student);
}
