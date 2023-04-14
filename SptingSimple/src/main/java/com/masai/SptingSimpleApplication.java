package com.masai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@SpringBootApplication
public class SptingSimpleApplication{

	public static void main(String[] args) {
		ApplicationContext apx= SpringApplication.run(SptingSimpleApplication.class, args);
		//apx.getBean(null)
		
		
	}
	
	@Bean
	public LocalValidatorFactoryBean validator(MessageSource ms) {
		
		LocalValidatorFactoryBean lvfb=new LocalValidatorFactoryBean();
		lvfb.setValidationMessageSource(ms);
		
		return lvfb;
		
	}

}
