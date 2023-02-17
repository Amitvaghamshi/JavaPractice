package com.masai;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackages = {"com.masai"})
@PropertySource("a1.properties")
public class Conf {
    
	
	
	@Bean("er")
	public A a() {
		return new A();
	}
	
	@Bean
	//@Lazy
	public List<Integer> li(){
		List<Integer> li=new ArrayList<Integer>();
		
		li.add(2);
		li.add(23);
		li.add(234);
		li.add(543);
		li.add(2345);
		
		return li;
	}
}
