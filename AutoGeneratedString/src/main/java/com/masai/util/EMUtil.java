package com.masai.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EMUtil {

	private static EntityManagerFactory emf;
	
	
	static {
		   emf=Persistence.createEntityManagerFactory("amit");
	}
	
	
	public static EntityManager provideEntityManager() {
		
		  return emf.createEntityManager();
		
	}
	
}
