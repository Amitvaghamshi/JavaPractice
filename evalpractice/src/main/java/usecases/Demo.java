package usecases;

import java.util.List;

import entities.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import util.EMUtil;

public class Demo {

	   public static void main(String[] args) {
		    
		   EntityManager em=EMUtil.provideEntityManager();
		  // System.out.println(em);
		   
		   //Employee e=new Employee();
		  //Employee e= em.find(Employee.class, 1);
		   
//		   e.setName("dako");
//		   e.setSalary(34565);
//		   
//		   em.getTransaction().begin();
//		   
//		   em.persist(e);
//		   em.getTransaction().commit();\
		  
//		  TypedQuery<Object[]> q= em.createQuery("select name,salary from Employee where id=:id ",Object[].class);
//		  q.setParameter("id", 1);
		  
//		  List<Object[]> li= q.getResultList();
//		  
//		  li.forEach(c->{
//			  System.out.println((String)c[0]);
//			  System.out.println((int)c[1]);
//			  System.out.println("*************");
//		  });
		  
//		  Object[] obj=q.getSingleResult();		  
//		  
//		  System.out.println(obj[0]+" "+obj[1]);
//		   
		   
		   
		   
		   Query q=em.createNamedQuery("native");
		   
		 System.out.println(q.getResultList());
		   
		  em.close();
	}
}
