package com.masai.service;

import java.util.List;

import com.masai.model.Student;
import com.masai.model.StudentDto;

public interface StudentService {
       
	     public Student addStudent(Student s);
	     public Student findStudentById(Integer id);
	     public List<Student> findAllStudent();
	     public Student updateStudent(Student s);
	     public Student findByName(Integer m);
	     public Student findByNameAndmk(Integer m,String name);
	     public List<String> findnamesOfstudent(Integer roll);
	     
	     public List<StudentDto> getnameandroll(Integer marks);
}
