package com.masai.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Student;
import com.masai.model.StudentDto;
import com.masai.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	
	@Autowired
	private StudentRepository studentrepo;

	@Override
	public Student addStudent(Student s) {
		
		  Student st= studentrepo.save(s);
		  
		  return s;
		  
	}

	@Override
	public Student findStudentById(Integer id) {
		   
		Optional<Student> st= studentrepo.findById(id);
		
		return st.orElseThrow(()->new IllegalArgumentException("Not found"));
	}

	@Override
	public List<Student> findAllStudent() {
		 return studentrepo.findAll();
	}

	@Override
	public Student updateStudent(Student s) {
		
		   Student st=studentrepo.findById(s.getRoll()).orElseThrow(()->new IllegalArgumentException("pappu request"));
		   
		   return studentrepo.save(s);
	}

	@Override
	public Student findByName(Integer m){
		   return studentrepo.findByMarks(m);
	}

	@Override
	public Student findByNameAndmk(Integer m, String name) {
		 
		Student sp=studentrepo.findByMarksAndName( m,name);
		
		return sp;
	}

	@Override
	public List<String> findnamesOfstudent(Integer roll) {
		 List<String> lis=studentrepo.getNamefromStudent(roll);
//		 List<String> liss=new ArrayList<>();
//		 liss.add(lis.get(0)[0]);
//		 liss.add(lis.get(0)[1]);
		 System.out.println(lis.get(0));
		 System.out.println(lis.get(1));
		 return lis;
	}

	@Override
	public List<StudentDto> getnameandroll(Integer marks) {
		 
		List<StudentDto> dtos=studentrepo.findByNMbyRoll(marks);
		
		System.out.println(dtos);
		
		return dtos;
		
	}

	
	
	
	
	
	
}
