package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Student;
import com.masai.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepo;

	@Override
	public Student saveStudent(Student student) {
		Student savedStudent = studentRepo.save(student);
		return savedStudent;
	}

	@Override
	public List<Student> getAllStudent() {
		return studentRepo.findAll();
	}

	@Override
	public Student findStudentByRoll(Integer roll) {
		
		return studentRepo.findById(roll).orElseThrow(()->new IllegalArgumentException("not found"));
	}

	@Override
	public Student updateStudent(Student student) {
		
		Student s=findStudentByRoll(student.getRoll());
		
		Student act= studentRepo.save(student);
		return act;
		
	}

}
