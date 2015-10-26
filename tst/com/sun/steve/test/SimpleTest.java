package com.sun.steve.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class SimpleTest {
	@Test()
	public void testAddition() {
		assertEquals(3, 1+2);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivision(){
		int a = 2/0;
	}
}
