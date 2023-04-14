package inheritence;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.MappedSuperclass;

//@Entity
//@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name = "diiss",discriminatorType = DiscriminatorType.INTEGER)
//@DiscriminatorValue(value = "1")
@MappedSuperclass
public class Top {

	  @Id
      int id;
      String name;
}
