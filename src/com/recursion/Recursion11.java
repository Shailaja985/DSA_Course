package com.recursion;

public class Recursion11 {

	public static void main(String[] args) {
		int i=3;
		fun(i);
	}

	 static void fun(int i) {
		 if(i>0) {
			 fun(i-1);
			 System.out.println(i);
		 }
	}
	
	

}
