package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;

import jakarta.persistence.CascadeType;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedNativeQueries;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)

@NamedQueries({
	 @NamedQuery(name = "yes",query = "select s from Employee s")
})

@NamedNativeQueries({
	  @NamedNativeQuery(name = "native",query = "select * from employee",resultClass = Employee.class)
})

public class Employee {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	   // @SequenceGenerator(name = "seq",allocationSize = 1,initialValue = 1,sequenceName = "sec")
	    private int id;
	    private String name;
	    private int salary;
	    
	    @Embedded
	    @ElementCollection(fetch = FetchType.EAGER)
	    @JoinTable(name = "Emp_Address",joinColumns = @JoinColumn(name="Eid"))
	   // @JoinColumn(name="Eid")
	    List<Address> addresses=new ArrayList<>();
	    
	    @ManyToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "Did")
	    private Department dept;
	    
		public Employee() {
	    	
	    }
	    
		
		

		public List<Address> getAddresses() {
			return addresses;
		}




		public void setAddresses(List<Address> addresses) {
			this.addresses = addresses;
		}




		public Employee(int id, String name, int salary) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
		}

		
		
		public Department getDept() {
			return dept;
		}




		public void setDept(Department dept) {
			this.dept = dept;
		}




		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
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

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
		}
	    
	    
}
