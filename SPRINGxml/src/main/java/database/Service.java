package database;

public class Service {
	
	 Dao dao;

	 public void service() {
		 System.out.println("Inside servive");
	 }

	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}
	
	
	 
	 
}
