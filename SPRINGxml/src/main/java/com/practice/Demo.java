package com.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import circuler.A;

public class Demo {

	public static void main(String[] args) {
		
		
		ApplicationContext apx=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Student st= apx.getBean(Student.class,"sts");
		st.funA();
		System.out.println(st.marks);
		
		A a=apx.getBean(A.class,"aa");
		a.hello();
		
		
	}
}
