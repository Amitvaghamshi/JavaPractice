package com.masai;

import java.applet.AppletContext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFinalApplication {

	public static void main(String[] args) {
	ApplicationContext apx=	 SpringApplication.run(SpringBootFinalApplication.class, args);
	}

}
