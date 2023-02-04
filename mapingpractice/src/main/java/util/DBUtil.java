package util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DBUtil {
       
	   public static EntityManagerFactory emf=Persistence.createEntityManagerFactory("amit");
	   
	   public static EntityManager provideManager() {
		   return emf.createEntityManager();
	   }
	  
}
