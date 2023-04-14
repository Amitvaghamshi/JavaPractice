package dao;

import model.Employee;

public interface EmployeeDao {

	public boolean createAccount(Employee account);
	public boolean deleteAccount(int accno);
	public boolean updateAccount(Employee account);
	public Employee findAccount(int accno);
}
