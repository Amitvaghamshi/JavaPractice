package com.masai.TestingApp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

//@TestInstance(Lifecycle.PER_CLASS)
class MathUtilTest {

	@Test
	void testDivision() {
		MathUtil u=new MathUtil();
		assertEquals(1,u.division(5, 3));
		
		
//		assertEquals(0, u.division(2, 0));
		
		assertThrows(ArithmeticException.class, ()->u.division(10, 0));

	}
	
	@Test
	void testMultiply() {
	///	fail("Not yet implemented");
	}
	
}
