package persistence;

import jakarta.persistence.EntityManager;
import util.EMUtil;

public class Demo {

       public static void main(String[] args) {
		
    	   
    	EntityManager em=EMUtil.provideEntityManager();
   		
   		Employee e=new Employee();
   		e.setEid(3);
   		e.setEname("apppa");
   		e.setSalary(13434);
   		e.getAdd().add(new Address("dhari","surat","2345"));
   		
   		Employee e2=new Employee();
   		e.setEid(4);
   		e.setEname("jambo");
   		e.setSalary(24414);
   		e.getAdd().add(new Address("padat","surat","26565"));
   		
   		
   		Department d=new Department();
   		d.setDeptId(1);
   		d.setDname("Civil");
   		d.setLocation("ahmdabad");
   		d.getEmps().add(e2);
   		
   		
   		d.getEmps().add(e);
   		e.getDept().add(d);
   		
   		//e2.setDept(d);
   		
   		em.getTransaction().begin();
   		
   		em.persist(d);
   		
   		em.getTransaction().commit();
   		em.close();
    	   
    	
	}
}
