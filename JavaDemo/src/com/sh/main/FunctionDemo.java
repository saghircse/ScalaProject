package com.sh.main;

public class FunctionDemo {

	public static void main(String[] args) {
		
		// Overloading : If two or more functions have same name but different arguments.
		
		int s = sum(2,5);
		
		int ss = sum(2,5,10);
		
		double y = sum(3.5,5);
		
		printSum(3,5);
		

	}
	
	
	static int sum(int a, int b) {
		return a+b;
	}
	
	static int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	
	
	static double sum(double a, int b) {
		return a+b;
	}
	
	static void printSum(int a, int b) {
		int s = a+b;
		System.out.println("Sum ="+s);
	}

}
