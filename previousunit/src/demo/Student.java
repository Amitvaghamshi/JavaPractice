package demo;

public class Student {

	  String name;
	  int marks;
	  String city;
	public Student(String name, int marks, String city) {
		super();
		this.name = name;
		this.marks = marks;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + ", city=" + city + "]";
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	  
	  
}
