package dao;

import jakarta.persistence.EntityManager;
import model.Employee;
import util.EMUtil;

public class EmployeeDaoImpl implements EmployeeDao{

	public boolean createAccount(Employee emp) {
		EntityManager em=EMUtil.getEntityManager();
		
		 boolean ans=false;
		 
		 try {
			 
			 em.getTransaction().begin();
			 em.persist(emp);
			 em.getTransaction().commit();
			 ans=true;
		} catch (Exception e) {
			
		}finally {
			em.close();
		}
		return ans;
	}

	public boolean deleteAccount(int accno) {
		 
		EntityManager em=EMUtil.getEntityManager();
		boolean ans=false;
		
		try {
			
			Employee e= em.find(Employee.class, accno);
			
			if(e!=null) {
				em.getTransaction().begin();
				em.remove(em);
				em.getTransaction().commit();
				ans=true;
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return ans;
	}

	public boolean updateAccount(Employee account) {
		boolean ans=false;
		
		try {
	    EntityManager em=EMUtil.getEntityManager();
			
		Employee e=	em.find(Employee.class, account.getId());
		if(e!=null) {
			em.getTransaction().begin();
			em.merge(account);
			em.getTransaction().commit();
			ans=true;
		}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return ans;
	}

	public Employee findAccount(int accno) {
		  EntityManager em=EMUtil.getEntityManager();
			
			return 	em.find(Employee.class, accno);
	}

}
