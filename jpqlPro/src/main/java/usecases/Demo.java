package usecases;


import java.util.List;

import been.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

public class Demo{
      public static void main(String[] args) {
		
    	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("amit");
    	 
    	 EntityManager em= emf.createEntityManager();
    	 
    	
    	//  Student s= em.find(Student.class, 1); 
    	  
    	 
//    	 Query q=em.createQuery("update Student set marks=543 where id=:m1 or id=:m2");
//    	 q.setParameter("m1", 1);
//    	 q.setParameter("m2", 2);
//    	 
//    	 em.getTransaction().begin();
//    	 
//    	     q.executeUpdate();
//    	 
//    	 em.getTransaction().commit();
//    	 em.close();
    	 
    	 
    	 
//    	Query q= em.createNamedQuery("Student.getdata");
//    	q.setParameter("id", -1);
    	 //Query q=em.createNativeQuery("select * from student", Student.class);
//  

    	 
    	 TypedQuery<Double> q=em.createQuery("select avg(marks) from Student  ",Double.class);
    	 
    //	List<Object[]> li=q.getResultList();
//    	
//    	li.forEach(o->{
//    		   System.out.println(o[0]+" "+o[1]);
//    		   System.out.println();
//    	});
    	
    	
    	double sum= q.getSingleResult();
    	
    	System.out.println(sum);
    	 
    	 
    	Query q2=em.createNamedQuery("amit");
    	 
      List<Student> stp=	q2.getResultList();
      System.out.println(stp);
	}
}
