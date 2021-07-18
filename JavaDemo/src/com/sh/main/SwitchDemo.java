package com.sh.main;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 65300;
		System.out.println("Number = "+n);

		
		int t = reverseNumber(n);		
		int zc = lengthNumber(n) - lengthNumber(t); // Count number of zeros at the end
		
		while(t>0) {
			int r = t%10;
			printDigit(r);
			t = t/10;
		}
		
		while(zc>0) {
			printDigit(0);
			zc--;
		}
		
		

	}
	
	
	static void printDigit(int x) {
		switch(x){
		case 0 : println("Zero"); break;
		case 1 : println("One"); break;
		case 2 : println("Two"); break;
		case 3 : println("Three"); break;
		case 4 : println("Four"); break;
		case 5 : println("Five"); break;
		case 6 : println("Six"); break;
		case 7 : println("Seven"); break;
		case 8 : println("Eight"); break;
		case 9 : println("Nine"); break;
		default : println("Invalid"); break;
		
		}
		
	}
	
	static int lengthNumber(int t) {
		int c =0;
		while(t>0) {
			t=t/10;
			c++;
		}
		
		return c;
		
	}
	
	static int reverseNumber(int n) {
		int t = n;
		int rev=0;
		int r=0;
		while(t>0) {
			r=t%10;
			rev = rev*10 + r;
			t=t/10;
		}
		
		return rev;
		
	}
	
	static void println(String x) {
		System.out.println(x);
	}

}
