package com.practice;

public class Student {

	String name;
	String marks;
	
	
	
	
	
	 public Student(String name, String marks) {
		super();
		this.name = name;
		this.marks = marks;
	}


	public void funA(){
		System.out.println("Hey Amit Well-Done");
		
		
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMarks() {
		return marks;
	}


	public void setMarks(String marks) {
		this.marks = marks;
	}
}
