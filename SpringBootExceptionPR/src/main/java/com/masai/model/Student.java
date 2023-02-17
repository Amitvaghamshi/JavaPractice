package com.masai.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Student {

	    private Integer roll;
	    private String name;
	    @JsonFormat(pattern = "dd/MM/yyyy")
	    private LocalDate dob;
	  //  @JsonIgnore
	    private String Add;
	    
	    public Student() {
	    	
	    }
	    
	    
	    
	    

		public Student(Integer roll, String name, LocalDate dob, String add) {
			super();
			this.roll = roll;
			this.name = name;
			this.dob = dob;
			Add = add;
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

		public LocalDate getDob() {
			return dob;
		}

		public void setDob(LocalDate dob) {
			this.dob = dob;
		}

		public String getAdd() {
			return Add;
		}

		public void setAdd(String add) {
			Add = add;
		}

		@Override
		public String toString() {
			return "Student [roll=" + roll + ", name=" + name + ", dob=" + dob + ", Add=" + Add + "]";
		}
	    
	    
	    
}
