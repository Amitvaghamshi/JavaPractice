package inheritence;

import jakarta.persistence.EntityManager;
import util.EMUtil;

public class Demo {

	public static void main(String[] args) {
		  EntityManager em=EMUtil.getEntityManager();
		  
		  A1 a1=new A1();
		  a1.name="jambo";
		  a1.a1_salary=43;
		  a1.id=3;
		  
		  A2 a2=new A2();
		  a2.name="rako";
		  a2.a2_salary=53;
		  a2.id=4;
		  
		  
		//  EntityManager em=EMUtil.getEntityManager();
		  em.getTransaction().begin();
		  em.persist(a1);
		  em.persist(a2);
		  em.getTransaction().commit();
		  em.close();
		  
//		  Query q=em.createQuery("from Top");
//		  List<Top> lis=q.getResultList();
//		  
//		  Top t= em.find(Top.class, 4);
//		  
//		  if(t instanceof A1){
//			  A1  t1=(A1)t;
//			  System.out.println(t1.name);
//			  System.out.println(t1.a1_salary);
//		  }else {
//			  A2  t1=(A2)t;
//			  System.out.println(t1.name);
//			  System.out.println(t1.a2_salary);
//		  }
		  
		  
	}
}
