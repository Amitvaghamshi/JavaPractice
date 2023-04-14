package usecases;

import jakarta.persistence.EntityManager;
import model.DepartMent;
import model.Employee;
import util.EMUtil;

public class D1 {

	public static void main(String[] args) {
		
		
		DepartMent d=new DepartMent();
		d.setName("computer");
		d.setAddr("pune");
	
		
		Employee e=new Employee();
		e.setAddr("lalpur");
		e.setName("bhavesh");
		
		Employee e2=new Employee();
		e2.setAddr("bhopa;");
		e2.setName("tapo");
		
		Employee e3=new Employee();
		e3.setAddr("goa");
		e3.setName("gado");
		
		Employee e4=new Employee();
		e4.setAddr("surat");
		e4.setName("milan");
		
		// dddd
		e.setDept(d);
		e2.setDept(d);
		e3.setDept(d);
		e4.setDept(d);
		
		d.getEmps().add(e);
		d.getEmps().add(e2);
		d.getEmps().add(e3);
		d.getEmps().add(e4);
		
		
		EntityManager em=EMUtil.getEntityManager();
		
		
		em.getTransaction().begin();
		em.persist(d);
		em.getTransaction().commit();

		em.close();
		
	}
}
