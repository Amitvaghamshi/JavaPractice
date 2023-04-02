package com.masai.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Student {
      
    @Id
   	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	  private String name;
	  private int marks;
	  private String add;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public Student(int id, String name, int marks, String add) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.add = add;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", add=" + add + "]";
	}
	  
	  
}
