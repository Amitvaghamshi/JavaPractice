package been;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
public class SalariedEmployee extends Employee{

	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	@Override
	public String toString() {
		return "SalariedEmployee [salary=" + salary + "]";
	}
	
	
}
