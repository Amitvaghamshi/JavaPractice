package com.masai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstApplication {

	public static void main(String[] args) {
		 ApplicationContext apx=  SpringApplication.run(SpringBootFirstApplication.class, args);
		 A a= apx.getBean("a",A.class);
		 a.funA();
	}

}
