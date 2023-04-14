package inheritence;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
//@DiscriminatorValue(value = "2")
public class A1 extends Top{

	int a1_salary;
}
