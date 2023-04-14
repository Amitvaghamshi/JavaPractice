package com.masai;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
	
	
	public static void main(String[] args) {
		
		ApplicationContext apx=new AnnotationConfigApplicationContext(AppConfig.class);
 	    Student sc= apx.getBean("student",Student.class);
 	    System.out.println(sc);
 	    
 	    
 	    List<String> se=apx.getBean("gets",List.class);
 	    System.out.println(se);
	}
	
	

}
