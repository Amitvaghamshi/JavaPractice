package been;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "mg")
	@SequenceGenerator(name = "mg",initialValue = 1000,sequenceName = "auto",allocationSize = 1)
	private int eid;
	
	private String name;
	private String address;
    private	int salary;
    
   public Employee(){
    	
    }
   

public Employee(int eid, String name, String address, int salary) {
	super();
	this.eid = eid;
	this.name = name;
	this.address = address;
	this.salary = salary;
}


public int getEid() {
	return eid;
}

public void setEid(int eid) {
	this.eid = eid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

@Override
public String toString() {
	return "Employee [eid=" + eid + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
}
   
   
}
