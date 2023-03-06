package pra;

import java.util.List;

import org.hibernate.boot.jaxb.mapping.NamedQuery;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import util.EMUtil;

public class Demo {

	public static void main(String[] args) {
		
		
		EntityManager em=EMUtil.provideEntityManager();
		
//		Student s=new Student(0,253, "khajur");
//		
//		em.getTransaction().begin();
//		em.persist(s);
//		em.getTransaction().commit();
//		em.close();
		
		
		
//		TypedQuery<Object[]> q= em.createQuery("select name ,marks from Student where roll=1",Object[].class);
//		
//		
//		Object[] st=q.getSingleResult();
		
		//for(Object[] x:st) {
//			String name= (String)st[0];
//			int marks=(int)st[1];
//			
//			System.out.println(name+" "+marks);
	//	}
		
		//System.out.println(st);
		
		Query q=em.createNamedQuery("native");
		List<Student> lis=q.getResultList();
		System.out.println(lis);
		
		em.close();
	}
}
