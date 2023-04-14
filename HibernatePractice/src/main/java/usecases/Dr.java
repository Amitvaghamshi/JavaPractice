package usecases;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import model.Employee;
import util.EMUtil;

public class Dr {
	
	
	public static void main(String[] args) {
		
		EntityManager em=EMUtil.getEntityManager();
		
		
		TypedQuery<Object[]> q=em.createQuery("select name from Employee e where e.name=:n " , Object[].class);
		q.setParameter("n", "amit");
		Object[] emps=(Object[])q.getSingleResult();
		System.out.println(emps[0]);
		
	}

}
