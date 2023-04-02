import dao.EmpdaoImpl;
import dao.EmployeeDao;
import model.Employee;

public class usecases {

	public static void main(String[] args) {
		
		
		Employee e=new Employee(1,"amit",3434,"eer");
		
		EmployeeDao dao=new EmpdaoImpl();
		dao.addEMployee(e);
		
	}
}
