package persistence;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	@Id
	int eid;
	String ename;
	int salary;
	@Embedded
	@ElementCollection(fetch = FetchType.EAGER)
	
	@JoinTable(name = "Adds",joinColumns = @JoinColumn(name = "Eid"))
	List<Address> add=new ArrayList<>();
	
	@ManyToMany
	List<Department> dept=new ArrayList<>();
	
}
