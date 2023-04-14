package com.masai;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {

	String name;
	int marks;
	String addr;
	
//	@Autowired
//	@Qualifier("scho")
//    School sk;
//    
    
	
	
	
	
	
	
	public Student(String name, int marks, String addr) {
		super();
		this.name = name;
		this.marks = marks;
		this.addr = addr;
	}
	
	public Student() {
		
	}


	@PreDestroy
	public void distroy() {
		System.out.println("Distroy the student");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Starat the student");
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
//	public School getSchool() {
//		return sk;
//	}
//
//	public void setSchool(School school) {
//		this.sk = school;
//	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + ", addr=" + addr + ", school= ] ";
	}

	

	
	
	
	
	
	
	
	
}
