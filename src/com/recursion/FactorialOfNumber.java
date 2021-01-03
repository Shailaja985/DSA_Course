package com.recursion;

import java.math.BigInteger;

public class FactorialOfNumber {

	public static void main(String[] args) {
		int n=299;
		if(n>19) 
			System.out.println("factorial of "+n+" is "+findFactorial2(n));
		else {
			System.out.println("factorial of "+n+" is "+findFactorial1(n));
		}
	}
	
	private static  BigInteger findFactorial2(int n) {
		BigInteger f=BigInteger.ONE;
		for(int i=2;i<=n;i++) {
			 f=f.multiply(BigInteger.valueOf(i));
		}
		return f;
		
	}

	private static int  findFactorial1(int i) {
		if(i==0 || i==1)
			return 1;
		else
			return findFactorial1(i-1)*i;
	}
	
	

}
