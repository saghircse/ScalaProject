package com.sh.main;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 6578;
		
		// Six Five Seven Eight
		
		// Find reverse
		
		int t = n;
		int rev=0;
		int r=0;
		while(t>0) {
			r=t%10;
			rev = rev*10 + r;
			t=t/10;
		}
		
		System.out.println("Reverse = "+rev);
		
		if(n==rev) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}

	}

}
