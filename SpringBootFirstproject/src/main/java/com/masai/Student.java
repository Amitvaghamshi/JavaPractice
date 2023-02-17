package com.masai;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Student {
	
     String name;
     String add;
     Integer marks;
     
	public Student(String name, String add, Integer marks) {
		
		this.name = name;
		this.add = add;
		this.marks = marks;
	}
     
	
     
}
