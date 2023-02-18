package com.masai.model;

public class StudentDto {

	private String name;
	private Integer marks;
	
	public StudentDto(String name, Integer marks) {
		this.name = name;
		this.marks = marks;
	}
	
	public StudentDto() {
		
	}

	@Override
	public String toString() {
		return "StudentDto [name=" + name + ", marks=" + marks + "]";
	}
	
	
}
