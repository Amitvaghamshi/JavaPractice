package dao;

import java.sql.Connection;

import jakarta.persistence.EntityManager;
import model.Employee;
import util.EMUtil;

public class EmpdaoImpl implements EmployeeDao{

	@Override
	public Employee addEMployee(Employee e) {
		
		try {
			EntityManager em=EMUtil.getentityManager();
			
		//	System.out.println(em);
			
			em.getTransaction().begin();	
			em.persist(e);
			em.getTransaction().commit();
			Employee er= em.find(Employee.class, 1);
			System.out.println(er);
			em.close();
			

			
			
			
			
		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		}
		
		return e;
		
	}

}
