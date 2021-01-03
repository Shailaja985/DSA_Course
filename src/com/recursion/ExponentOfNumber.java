package com.recursion;

public class ExponentOfNumber {

	public static void main(String[] args) {
		int number=5;
		int exponent=4;
		double result1=findExponent1(number,exponent);
		System.out.println(result1);
		double result2=findExponent2(number,exponent);
		System.out.println(result2);
		double result3=findExponent3(number,exponent);
		System.out.println(result3);
		double result4=findExponent4(number,exponent);
		System.out.println(result4);
		
	}
	/*
	 * 
	 * using Math.pow()
	 */
	private static double findExponent1(int number,int exponent) {
		return Math.pow(number,exponent);
	}
	
	/*
	 * 
	 * using recursion
	 */
	private static double findExponent2(int number,int exponent) {
		if(exponent==0)
			return 1;
		else
			return findExponent2(number,exponent-1)*number;
	}
	
	/*
	 * 
	 * redusing the number of calls in recursion 
	 */
	private static double findExponent3(int number,int exponent) {
		if(exponent==0)
			return 1;;
		if(exponent%2==0)
			return findExponent3(number*number,exponent/2);
		else
			return number*findExponent3(number*number,(exponent-1)/2);
	}
	
	/*
	 * using iteration
	 * 
	 */
	private static double findExponent4(int number,int exponent) {
		double result=1;
		if(exponent==0)
			return 1;
		else
			for(int i=1;i<=exponent;i++) {
				result *=number;
			}
		return result;
	}
}
