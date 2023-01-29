package been;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DEmo {

	
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("amit");
		EntityManager em= emf.createEntityManager();
		Employee e=em.find(Employee.class,2);
		
		System.out.println(e);
		
		em.close();
		
		
	}
}
