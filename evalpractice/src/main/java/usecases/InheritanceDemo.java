package usecases;

import entities.ContractEmp;
import jakarta.persistence.EntityManager;
import util.EMUtil;

public class InheritanceDemo {
   public static void main(String[] args) {
	    
	   ContractEmp cp=new ContractEmp();
	   cp.setName("amit");
	   cp.setPeriod(3);
	   cp.setSalary(43223);
	   
	   EntityManager em=EMUtil.provideEntityManager();
	   
	   
	   em.getTransaction().begin();
	   
	   em.persist(cp);
	   
	   em.getTransaction().commit();
	   
}
}
