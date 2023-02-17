package com.masai;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

@Component
public class Student {

	@Min(value = 100,message = "{roll.invalid}")
	private Integer roll;
	@Size(min = 3,max = 8,message = "size between 3 to 8")
	private String name;
	@Past(message = "dob is not in future")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dob;
	private String add;
	
	
	public Student() {
		 
	}


	public Integer getRoll() {
		return roll;
	}


	public void setRoll(Integer roll) {
		this.roll = roll;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAdd() {
		return add;
	}


	public void setAdd(String add) {
		this.add = add;
	}


	


	public LocalDate getDob() {
		return dob;
	}


	public void setDob(LocalDate dob) {
		this.dob = dob;
	}


	public Student(Integer roll, String name, LocalDate dob, String add) {
		super();
		this.roll = roll;
		this.name = name;
		this.dob = dob;
		this.add = add;
	}


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", add=" + add + "]";
	}
	
	
	
	
	
	
	
}
