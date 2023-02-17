package com.masai;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service(value = "s1")
//@Scope("prototype")
public class Student {

	    @Value("${db.driverName}")
	    String name;
	    @Value("23")
	    int marks;
	    @Value("${db.password}")
	    
	    String add;
	    
	    @Autowired()
	    @Qualifier(value = "er")
	    A a5;
	    
	    @Autowired(required = false)
	    @Qualifier("li")
	    List<Integer> lis;
	    
	    
	    @PreDestroy
	    public void distroy() {
	    	 
	    	System.out.println("Hey i am going to distroy");
	    }
	    
	    @PostConstruct
	    public void init() {
	    	System.out.println("I will execute first");
	    }
	    
	    

}
