package com.recursion;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		long startTime;
		long endTime;
		int number=100000;
		long sum;
		
		startTime=System.nanoTime();
		 sum =findSum4(number);
		System.out.println(sum);
		 endTime=System.nanoTime();
		System.out.println("time taken to excecute findSum1 is "+startTime+"-"+endTime+"= "+(endTime-startTime));
		
		startTime=System.nanoTime();
		 sum =findSum2(number);
		System.out.println(sum);
		 endTime=System.nanoTime();
		System.out.println("time taken to excecute findSum2 is "+startTime+"-"+endTime+"= "+(endTime-startTime));
		
		startTime=System.nanoTime();
		 sum =findSum3(number);
		System.out.println(sum);
		 endTime=System.nanoTime();
		System.out.println("time taken to excecute findSum3 is "+startTime+"-"+endTime+"= "+(endTime-startTime));
	}
	/**
	 * using recursion
	 * this may cause stackover flow even number is in limit
	 */
	private static int findSum1(int n) {
		if(n==0)
			return 0;
		else {
			return findSum1(n-1)+n;
		}
	}
	/**
	 * using loops
	 */
	static int findSum2(int n) {
		int s=0;
		if(n==0)
			return 0;
		else {
			for(int i=0;i<=n;i++) {
				s=s+i;
			}
		    return s;
		}
	}
	/**
	 * efficient way 
	 */
	static int findSum3(int n) {
		return (n*(n+1)/2);
	}
	/**
	 * To avoid the stack overflow even the number is in limit
	 */
	static int findSum4(int n) {
		if(n%2==0) {
			return (n/2)*(n+1);
		}else {
			return ((n+1)/2)*n;
		}
	}
	
}
