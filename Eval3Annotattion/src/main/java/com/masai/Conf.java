package com.masai;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@ComponentScan(basePackages = {"com.masai"})
@PropertySources({@PropertySource("x.properties")})
public class Conf {

	
	public A geta() {
		return new A();
	}
	
	@Bean
	public B getb() {
		System.out.println("inside get b");
		return new B();
		
		
	}
}
