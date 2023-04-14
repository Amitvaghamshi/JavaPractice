package usecases;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.masai.Business;
import com.masai.Journy;

public class Demo {

	public static void main(String[] args) {
		
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Journy j=ctx.getBean(Journy.class,"j");
		j.journy();
		System.out.println(j.getDays());
		
		
		
		
//		Business b=ctx.getBean(Business.class,"bus");
//		System.out.println(b.getLi()); 
		
		 
	}
}
