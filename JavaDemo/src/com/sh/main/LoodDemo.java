package com.sh.main;

public class LoodDemo {
	public static void main(String[] args) {
		
		// for loop
		
		int n=20;
		
		// for(initializtion ; condition ; increment/decrement)
		System.out.println("====================Even");
		for(int i=1; i<=n; i++) {
			
			if(i%2==0) {
				System.out.println(i);
			}
			
		}
		
		System.out.println("====================Odd");
		int x = 1;
		while(x<=n) {
			if(x%2!=0) {
				System.out.println(x);
			}
			
			x++;
		}
		
		int k=1;
		do {
			if(k%2!=0) {
				System.out.println(k);
			}
			
		}while(k<=n);
		
		
	}
}
