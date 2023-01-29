package usecases;

import com.masai.been.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Demo {

	  public static void main(String[] args) {
		    
		  EntityManagerFactory emf= Persistence.createEntityManagerFactory("amit");
		  EntityManager em=emf.createEntityManager();
		  
		  
//		 Employee e= em.find(Employee.class, 2);
//		 System.out.println(e);
		 
	//	 em.clear();
		  
		  
		 /// Employee e=new Employee(8,"ad","332",3000);
		  
		  em.getTransaction().begin();
		  
		  Employee e= em.find(Employee.class, 8);
		  em.remove(e);
		  em.getTransaction().commit();
		 
		  
		  em.close();
		  
		  System.out.println("Done");
		  //   
		  
	}
}
