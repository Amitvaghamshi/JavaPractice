package model;

public class Student {

	int roll;
	String address;
	String name;
	String email;
	String pass;
	
	
	public int getRoll() {
		return roll;
	}
	
	
	
	public Student(int roll, String address, String name, String email, String pass) {
		super();
		this.roll = roll;
		this.address = address;
		this.name = name;
		this.email = email;
		this.pass = pass;
	}



	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", address=" + address + ", name=" + name + ", email=" + email + ", pass="
				+ pass + "]";
	}
	
	
	
	
}
