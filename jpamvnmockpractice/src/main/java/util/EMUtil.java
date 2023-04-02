package util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EMUtil {

	private static EntityManagerFactory emf;
	
	static {
		emf=Persistence.createEntityManagerFactory("eval");
		
	}
	
	
	public static EntityManager getentityManager(){
		return emf.createEntityManager();
	}
}
