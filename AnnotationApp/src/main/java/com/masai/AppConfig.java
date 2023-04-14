package com.masai;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.masai"})
public class AppConfig {
	
	
	@Bean
	public List<String> gets(){
		List<String>  lis=new ArrayList<>();
		lis.add("amit");
		lis.add("ashish");
		
		return lis;
	}

}
