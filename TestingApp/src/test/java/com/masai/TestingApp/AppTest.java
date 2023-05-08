package com.masai.TestingApp;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

//@TestInstance(Lifecycle.PER_CLASS)
public class AppTest {
	
	@BeforeAll
	public static void init() {
		System.out.println("Inside init method");
	}
	
	@BeforeEach
	public  void bf() {
		System.out.println("Inside Before Each method");
	}
	
	@Test
	public  void test() {
		System.out.println("Inside test method");
	}
	
	@Test
	public  void test2() {
		System.out.println("Inside test method 2");
		for(int i=0;i<1000;i++) {
			System.out.println("Hell");
			
		}
	}
	
	@AfterEach
	public  void af() {
		System.out.println("Inside after Each method");
	}
	
	@AfterAll
	public static void destroy() {
		System.out.println("Inside destroy method");
	}
}
