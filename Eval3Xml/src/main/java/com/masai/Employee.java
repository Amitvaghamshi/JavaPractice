package com.masai;

import java.util.List;
import java.util.Set;

public class Employee {

	  String name;
	  Department dname;
	  String location;
	  Set<Department> lis;
	  
	  
	  
	public String getName() {
		return name;
	}
	
	
	public Set<Department> getLis() {
		return lis;
	}


	public void setLis(Set<Department> lis) {
		this.lis = lis;
	}


	public void setName(String name) {
		this.name = name;
	}
	public Department getDname() {
		return dname;
	}
	public void setDname(Department dname) {
		this.dname = dname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dname=" + dname + ", location=" + location + "]";
	}
	  
	  
	public void init() {
		System.out.println("Inside init  method");
	}
	
	public void distroy() {
		System.out.println("Inside distroy method");
	}
	
}
