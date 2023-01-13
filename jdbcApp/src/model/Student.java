package model;

public class Student {
	
	int roll;
	String name;
	String add;
	String mobile;
	
	public Student(){
		
	}

	public Student(int roll, String name, String add, String mobile) {
		super();
		this.roll = roll;
		this.name = name;
		this.add = add;
		this.mobile = mobile;
	}

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

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", add=" + add + ", mobile=" + mobile + "]";
	}
	
	
	
}
