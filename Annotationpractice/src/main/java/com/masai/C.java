package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class C {

	@Autowired
	private Environment env;
	
	void func() {
		System.out.println("Inside fun c");
	}
	
	public void envired() {
		
		System.out.println("inside funA of A");
		System.out.println("Driver name  is "+env.getProperty("db.driverName"));
		System.out.println("Connection URL  is "+env.getProperty("db.url"));
		System.out.println("Username  is "+env.getProperty("db.username"));
		System.out.println("Password  is "+env.getProperty("db.password"));
	}
}
