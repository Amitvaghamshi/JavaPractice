package util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EMUtil {

	private static EntityManagerFactory emf;
	
	static {
		emf=Persistence.createEntityManagerFactory("studentUnit");
	}
	
	public static EntityManager getEntityManager() {
		
		return emf.createEntityManager();
	}
}
