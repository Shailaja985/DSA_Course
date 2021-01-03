package com.recursion;

public class RecursionStaticVariable {
	static int x=0;
	public static void main(String[] args) {
		int i=5;
		int result=fun(i);
		System.out.println(result);
	}
	
	static int fun(int i) {
		if(i>0) {
			++x;
			System.out.println(x);
			return fun(i-1)+x;
		}
		return 0;
	}
}
