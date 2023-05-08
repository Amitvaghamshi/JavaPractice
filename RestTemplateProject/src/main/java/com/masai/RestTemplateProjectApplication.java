package com.masai;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.masai.template.RestDemo;

@SpringBootApplication
public class RestTemplateProjectApplication {

	public static void main(String[] args) {
		
	  ConfigurableApplicationContext apx= SpringApplication.run(RestTemplateProjectApplication.class, args);
	  
	   RestDemo demo= apx.getBean(RestDemo.class);
//	  demo.getdata();
//	  demo.postPlant();
//	  demo.updatePlant();
//	  demo.deleteplant(102);
	  
	}
	
	@Bean
	public RestTemplate createRest(){
		return new RestTemplate();
	}
	
	

}
