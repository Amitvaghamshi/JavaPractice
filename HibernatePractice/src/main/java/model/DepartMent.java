package model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import model.Employee;
@Entity
public class DepartMent {
   
	
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private int deptId;
	   private String name;
	   private String addr;
	   
	   @OneToMany(mappedBy = "dept",cascade = CascadeType.ALL)
	   List<Employee> emps=new ArrayList<>();
	   
	   
	   
	public List<Employee> getEmps() {
		return emps;
	}
	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
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
	
	
	@Override
	public String toString() {
		return "DepartMent [deptId=" + deptId + ", name=" + name + ", addr=" + addr + "]";
	}
	   
	   
	
}
