package com.assignment3_3.Assignment3_3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	
	Calculator testObj;
	long tax, product_price  ;
	double tax_rate,expected, actual;
	

	@Before
	public void setUp() throws Exception {
		product_price=200;
		tax_rate=0.15;
		testObj = new Calculator();
		expected = 200*0.15;
	    actual = testObj.product(product_price,tax_rate);
		
	}

	@Test
	public void test() {
		assertEquals(expected, actual, 0.01);

	}
	
	@After
	public void tearDown() throws Exception {
		testObj = null;
		
		
	}



}