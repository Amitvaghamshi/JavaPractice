package inheritence;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
//@DiscriminatorValue(value = "2")
public class A2 extends Top{

	int a2_salary;
}
