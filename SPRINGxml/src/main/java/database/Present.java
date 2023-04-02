package database;

public class Present {
	
	Service service;
	
	public void service() {
		System.out.println("Inside service layer");
		service.service();
	}

	public Present(Service service) {
		super();
		this.service = service;
	}

	Present(){
		
	}
	

	
}
