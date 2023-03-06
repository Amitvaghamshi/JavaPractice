package inheritance;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class SalariedEmployee extends Employee{

	private int salary;

}
