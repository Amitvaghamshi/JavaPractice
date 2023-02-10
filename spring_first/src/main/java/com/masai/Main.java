package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		B a= ctx.getBean("b5",B.class);
		B a2= ctx.getBean("b5",B.class);
		
		if(a==a2) {
			System.out.println("same");
		}else {
			System.out.println("diff");
		}
		
       
		ClassPathXmlApplicationContext x= (ClassPathXmlApplicationContext)ctx;
		
		
		Demo d=ctx.getBean("d1",Demo.class);
		
		
		Ops o=ctx.getBean("mp",Ops.class);
	    System.out.println(o.getMap());
		
//x.close();
//		d.showDetails();

	}

}
