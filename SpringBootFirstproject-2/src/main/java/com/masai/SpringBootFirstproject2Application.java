package com.masai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@SpringBootApplication
public class SpringBootFirstproject2Application {

	public static void main(String[] args) {
		 ApplicationContext apx= SpringApplication.run(SpringBootFirstproject2Application.class, args);
		 
		//Student s= apx.getBean(Student.class);
		//System.out.println(s);
	}
	
	
	
	
	public LocalValidatorFactoryBean valid(MessageSource ms) {
		   LocalValidatorFactoryBean fb=new LocalValidatorFactoryBean();
		   fb.setValidationMessageSource(ms);
		   
		   return fb;
	}

}
