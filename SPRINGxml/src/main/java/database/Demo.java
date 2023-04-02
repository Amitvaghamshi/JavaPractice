package database;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	
	public static void main(String[] args) {
		ApplicationContext apx=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Present ps= apx.getBean("p", Present.class);
		ps.service();
		
		
		Student st=apx.getBean("stu",Student.class);
		System.out.println(st.getAdd());
	}
	
	

}
