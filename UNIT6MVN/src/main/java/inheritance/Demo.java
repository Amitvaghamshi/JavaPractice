package inheritance;

import jakarta.persistence.EntityManager;
import util.EMUtil;

public class Demo {

	public static void main(String[] args) {
		
		EntityManager em=EMUtil.provideEntityManager();
		
		Employee emp=new Employee();
		emp.setName("Ram");
		
		SalariedEmployee semp=new SalariedEmployee();
		semp.setName("Mohan");
		semp.setSalary(85000);
		
		ContractualEmployee cemp=new ContractualEmployee();
		cemp.setName("Hari");
		cemp.setCostPerDay(3000);
		cemp.setNoOfWorkingDays(10);
		em.getTransaction().begin();
		em.persist(emp);
		em.persist(semp);
		em.persist(cemp);
		em.getTransaction().commit();
		System.out.println("done");
	}
}
