package com.masai.util;

import jakarta.persistence.EntityManager;

public class Demo {

	public static void main(String[] args) {
		  
		
		EntityManager em=EMUtil.provideEntityManager();
		
		Student st=new Student();
		st.setName("kelo");
		st.setAddr("sid");
		
		
		em.getTransaction().begin();
		em.persist(st);
		em.getTransaction().commit();
		
		em.close();
	}
}
