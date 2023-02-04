package been;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Department{

	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private int deptid;
	  private String name;
	  private String location;
	  
	  @ManyToMany(cascade = CascadeType.ALL,mappedBy = "dep")
	  
	  //@JoinColumn(name = "did")
	  List<Employee> emps=new ArrayList<>();
	
	  
	public Department() {
		  
	}

	public Department(int deptid, String name, String location) {
		super();
		this.deptid = deptid;
		this.name = name;
		this.location = location;
	}
	
	

	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", name=" + name + ", location=" + location + "]";
	}
	  
}
