package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component(value = "a")
public class A {
	
	@Value("${A.name}")
	String name;

	@Autowired
	@Qualifier("getb")
	B b;
	
	@Autowired
	Environment env;
	
	void envf() {
		System.out.println(env.getProperty("A.name"));
	}
	
//	A(B b3){
//		this.b=b3;
//	}
	
    void funA() {
    	System.out.println("Inside fun A");
    }
}
