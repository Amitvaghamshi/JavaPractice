package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
	
	public static void main(String[] args) {
		    
		ApplicationContext apx=new AnnotationConfigApplicationContext(Conf.class);
		
		Student s1= apx.getBean("s1",Student.class);
		Student s2= apx.getBean("s1",Student.class);
		System.out.println(s1.name);
	    //s.a.funA();
		
		System.out.println(s1.lis);
		
		AnnotationConfigApplicationContext cx=(AnnotationConfigApplicationContext)apx;
		//cx.close();
	    
	}

	  
}
