package com.assignment3_3.Assignment3_3;

public class Calculator {

//	public long product(int i, int j, int k, int l) {
	public long product(long...ls) {
		long result = ls[0];
		for(int a=1; a<ls.length ; a++) {
			result*=ls[a];
		}
		
		return result;
	}

}