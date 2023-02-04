package been;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
public class ContractEmployee extends Employee{

	private int noOfWorkingDays;
	private int costPerDay;
	
	public ContractEmployee() {
		
	}

	public ContractEmployee(int noOfWorkingDays, int costPerDay) {
		super();
		this.noOfWorkingDays = noOfWorkingDays;
		this.costPerDay = costPerDay;
	}

	public int getNoOfWorkingDays() {
		return noOfWorkingDays;
	}

	public void setNoOfWorkingDays(int noOfWorkingDays) {
		this.noOfWorkingDays = noOfWorkingDays;
	}

	public int getCostPerDay() {
		return costPerDay;
	}

	public void setCostPerDay(int costPerDay) {
		this.costPerDay = costPerDay;
	}
	
}
