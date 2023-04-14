package model;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;

@Entity

public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "my_gen")
	@SequenceGenerator(name = "my_gen",sequenceName = "gen",allocationSize = 1,initialValue = 1)
	private Integer id;
	private String name;
	private String addr;
	
	
	
	
	@Embedded
	@ElementCollection
	@JoinTable(name = "emp_Address")
	@JoinColumn(name="Emp_id")
	private  List<Address> address;
	
	@ManyToOne
	@JoinColumn(name = "deptId")
	private DepartMent dept;
	
	
	
	
	public DepartMent getDept() {
		return dept;
	}
	public void setDept(DepartMent dept) {
		this.dept = dept;
	}
	public Employee(Integer id, String name, String addr) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", addr=" + addr + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}
