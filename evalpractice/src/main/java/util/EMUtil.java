package util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EMUtil {

	public static EntityManagerFactory emf;
	
	static {
		emf=Persistence.createEntityManagerFactory("eval-unit");
	}
	
	public static EntityManager provideEntityManager() {
		     return emf.createEntityManager();
	}
	
}
