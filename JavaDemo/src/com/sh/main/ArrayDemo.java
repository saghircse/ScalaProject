package com.sh.main;

public class ArrayDemo {

	public static void main(String[] args) {
		
		//int ar[] = new int[10]; // Declare
		//ar[0]=5;
		int ax[] = {5,7,3,9,10};
		int x = 3; // Search this
		
		int len = ax.length;
		
		boolean isFound=false;
		for(int i=0;i<len;i++) {
			if(ax[i]==x) {
				isFound=true;
				break;
			}
		}
		
		if(isFound) {
			System.out.println("Found");
		}else {
			System.out.println("Not Found");
		}
		
	}

}
