package com.masai.demo;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;

public class Student {

	int roll;
	String name;
	String addr;
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}",message = "{name.invalid}")
	String passWord;
	
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", addr=" + addr + ", passWord=" + passWord + "]";
	}
	
	
	
	
	
	
	
	
}
