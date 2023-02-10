package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;


@Entity
@PrimaryKeyJoinColumn(name = "Pk")
public class ContractEmp extends Employee{

	
	   int period;

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	@Override
	public String toString() {
		return "ContractEmp [addresses=" + addresses + "]";
	}

	
	
	
	
	
	   
}
