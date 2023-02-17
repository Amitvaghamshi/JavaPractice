package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext apx=new ClassPathXmlApplicationContext("ApplicationContaxt.xml");
		
		Employee e1= apx.getBean("e1",Employee.class);
		Employee e2= apx.getBean("e1",Employee.class);
		System.out.println(e1.getLis());
		ClassPathXmlApplicationContext cp= (ClassPathXmlApplicationContext)apx;
		cp.close();
		
	}
}
