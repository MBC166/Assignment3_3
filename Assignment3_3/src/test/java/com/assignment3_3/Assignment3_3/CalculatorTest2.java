package com.assignment3_3.Assignment3_3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest2 {
	
	
	Calculator2 testObj;
	long total_price, nums, unitPrice, expected, actual;
	

	@Before
	public void setUp() throws Exception {
		nums=100;
		unitPrice=3;
		testObj = new Calculator2();
		expected = 100*3;
	    actual = testObj.product(nums,unitPrice);
		
	}

	@Test
	public void test() {
		assertEquals(expected, actual);

	}
	
	@After
	public void tearDown() throws Exception {
		testObj = null;
		
		
	}



}