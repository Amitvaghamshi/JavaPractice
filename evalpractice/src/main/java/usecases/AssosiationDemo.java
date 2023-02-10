package usecases;

import entities.Department;
import entities.Employee;
import jakarta.persistence.EntityManager;
import util.EMUtil;

public class AssosiationDemo {

	public static void main(String[] args) {
		  EntityManager em=EMUtil.provideEntityManager();
		  
//		  Department d=new Department();
//		  d.setDname("civil");
//		  d.setLocation("gujrat");
//		  
//		  Employee e=new Employee(0,"amit",345);
//		  e.setDept(d);
//		  Employee e1=new Employee(0,"ashish",3455);
//		  e1.setDept(d);
//		  Employee e2=new Employee(0,"tarbuch",5445);
//		  e2.setDept(d);
//		  Employee e3=new Employee(0,"popaiyo",3545);
//		  e3.setDept(d);
//		  
//		  d.getEmps().add(e);
//		  d.getEmps().add(e1);
//		  d.getEmps().add(e2);
//		  d.getEmps().add(e3);
//		  
//		  em.getTransaction().begin();
//		  
//		  em.persist(d);
//		  
//		  em.getTransaction().commit();
		  
//		  Employee e=new Employee();
//		  e.setName("amti");
//		  e.setDept(new Department(0,"cs","mh"));
//		  e.setSalary(345);
//		  
//		  em.getTransaction().begin();
//		  
//		  em.persist(e);
//		  
//		  em.getTransaction().commit();
		  
		 Employee e=  em.find(Employee.class, 1);
		 System.out.println(e.getDept());
		  
		  em.close();
	}
}
