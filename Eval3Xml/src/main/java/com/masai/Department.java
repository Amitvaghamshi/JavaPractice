package com.masai;

public class Department {

	  String dname;
	  int did;
	  String location;
	  
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Department [dname=" + dname + ", did=" + did + ", location=" + location + "]";
	}
	  
	  
	
}
