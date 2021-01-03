package com.recursion;

public class Recursion1 {

	public static void main(String[] args) {
		int i=3;
		fun(i);
	}

	 static void fun(int i) {
		 if(i>0) {
			 System.out.println(i);
			 fun(i-1);
		 }
	}
	
	

}
