package com.masai.collection;

public class Student implements Comparable<Student>{

	  private String name;
	  private Integer marks;
	  
	  
	  
	  
	public Student(String name, Integer marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}


	

	@Override
	public int compareTo(Student o) {
		   if(this.getName().compareTo(o.getName())>1) {
			   return 1;
		   }else if(this.getName().compareTo(o.getName())<1){
			   return -1;
		   }else if(this.getMarks()>o.getMarks()){
			   return -1;
		   }else {
			   return 1;
		   }
	}
	  
	
	  
}
