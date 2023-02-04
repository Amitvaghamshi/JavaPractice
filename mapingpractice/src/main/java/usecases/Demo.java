package usecases;

import been.Address;
import been.Department;
import been.Employee;
import jakarta.persistence.EntityManager;
import util.DBUtil;

public class Demo {

	public static void main(String[] args) {
		
		EntityManager em=DBUtil.provideManager();
		Employee e=new Employee();
		
		Department d=new Department();
		d.setName("civil");
		d.setLocation("Rajsthan");
	
		
		e.setName("ashish");
		e.setSalary(45543);
		e.getAdds().add(new Address("guju", "dse", "dfs"));
	
		
		e.getDep().add(d);
		d.getEmps().add(e);
		
		em.getTransaction().begin();
		
		em.persist(e);
		em.persist(d);
		
		em.getTransaction().commit();
		
//		Query q= em.createQuery("from Department where name='civil'");
//		
//		em.getTransaction().begin();
//		
//		List<Department> dep= q.getResultList();
//		dep.forEach(d->System.out.println(d.getEmps()));
//		
//		em.getTransaction().commit();
//		
		
	}
}
