package inheritance;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class ContractualEmployee extends Employee{

	private int noOfWorkingDays;
	private int costPerDay;
}
