import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext apx=new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		Student s=apx.getBean("s1", Student.class);
		System.out.println(s);
		
		
		Student s2=apx.getBean("s1", Student.class);
		System.out.println(s==s2);
		
//		ClassPathXmlApplicationContext cp=(ClassPathXmlApplicationContext)apx;
//		cp.close(); 
		
	}
}

