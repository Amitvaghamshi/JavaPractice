package usecases;

import been.ContractEmployee;
import been.Employee;
import been.SalariedEmployee;
import jakarta.persistence.EntityManager;
import util.DBUtil;

public class Demo {

	public static void main(String[] args) {
		
//		Employee e=new Employee();
//	 	e.setName("amit");
		
		ContractEmployee c=new ContractEmployee();
		c.setName("kaushik");
		c.setCostPerDay(234);
		c.setNoOfWorkingDays(7);
		
		
		SalariedEmployee s=new SalariedEmployee();
		s.setName("rohit");
		s.setSalary(90000);
		
		EntityManager em=DBUtil.provideManager();
		
		
		em.getTransaction().begin();
		
	//	em.persist(e);
		em.persist(s);
		em.persist(c);
		
		em.getTransaction().commit();
		
	}
}
