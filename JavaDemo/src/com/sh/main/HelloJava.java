package com.sh.main;

public class HelloJava {

	public static void main(String[] args) {
		
		System.out.println("Hello Java");
		
		String name = "Aditya";
		System.out.println("I am "+name);
		
		// a,b -> variables, int -> datatype, =,+ -> operators
		
		int a = 5;
		int b = 10;
		
		int s = a + b;
		
		System.out.println("Sum of "+a+" and "+b+" is "+s);
		
		int n = 10;
		
		String status="";
		if(n%2==0) {
			//println("even");
			status = "even";
		}else {
			//println("odd");
			status="odd";
		}
		
		println(status);
		
		String flag = (n%2==0)?"even":"odd";
		println(flag);
		
		

	}
	
	static void println(String s) {
		System.out.println(s);
	}

}
