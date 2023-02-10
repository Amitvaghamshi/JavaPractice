package usecases;

import entities.Address;
import entities.Employee;
import jakarta.persistence.EntityManager;
import util.EMUtil;

public class HasDemo {

	public static void main(String[] args) {
		   EntityManager em=EMUtil.provideEntityManager();
		   
		   Employee e=new Employee();
		   e.setName("chatur");
		   e.setSalary(2343);
		   
		   e.getAddresses().add(new Address("gujj","amreli","343234"));
		   e.getAddresses().add(new Address("jam","dekhi","43234"));
		   
		   em.getTransaction().begin();
		   
		   em.persist(e);
		   
		   em.getTransaction().commit();
		   
//		   Employee e= em.find(Employee.class,1);
//		   
//		   em.close();
//		   System.out.println(e.getAddresses());
//		   
	}
}
