package model;

import jakarta.persistence.EntityManager;
import util.EMUtil;

public class Demo {

	public static void main(String[] args) {
		
		
		 EntityManager em=EMUtil.getEntityManager();
		 
		 Employee e=new Employee();
		 e.setName("khiladi");
		 e.setAddr("bombe");
		 
		 em.getTransaction().begin();
		 em.persist(e);
		 em.getTransaction().commit();
	    //	em.close();
		 
		 
		 
		 
//		 Employee e=em.find(Employee.class, 1);
//		 System.out.println(e);
//		 em.clear();
//		 
//		 // hear we get that dml Always done inside trasaction area
//		 em.getTransaction().begin();
//		// em.remove(e);
//		 
//		 e.setAddr("ameli");
//		 em.merge(e);
//		 em.getTransaction().commit();
//		 em.close();
		 
		 
		 
		 
	}
}
