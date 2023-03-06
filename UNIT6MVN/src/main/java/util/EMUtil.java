package util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EMUtil {
	
	private static EntityManagerFactory emf=null;
	
	  static {
		  emf=Persistence.createEntityManagerFactory("studentunit");
	  }
	  
	  public static EntityManager provideEntityManager() {
		  return emf.createEntityManager();
	  }
}
