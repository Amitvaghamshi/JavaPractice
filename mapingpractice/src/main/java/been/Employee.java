package been;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empid;
	private String name;
	private int salary;
	
	@ElementCollection(fetch = FetchType.EAGER)
	@Embedded
	@JoinTable(name = "empadds",joinColumns = @JoinColumn(name="eid"))
	private List<Address> adds=new ArrayList<Address>();
	
	@ManyToMany(cascade = CascadeType.ALL)
	//@JoinColumn(name = "did")
	@JoinTable(name = "dep_emp",joinColumns = @JoinColumn(name="did"),inverseJoinColumns = @JoinColumn(name="emp"))
	List<Department> dep=new ArrayList<>();
	
	
	public Employee() {
		
	}
	
	
	

	public Employee(int empid, String name, int salary, List<Address> adds) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.adds = adds;
	}

	
	
	



	public List<Department> getDep() {
		return dep;
	}




	public void setDep(List<Department> dep) {
		this.dep = dep;
	}




	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public List<Address> getAdds() {
		return adds;
	}

	public void setAdds(List<Address> adds) {
		this.adds = adds;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", adds=" + adds + "]";
	}
	
	
	
}
