package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	 
	public static void main(String[] args) {

		ApplicationContext apx=new AnnotationConfigApplicationContext(AppConfig.class);
		
	}

}
