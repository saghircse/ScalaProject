package com.sh.oop;

public class Student {
	
	// States - Instance variables 
	int roll;
	String name;
	double marks;
	static String school="XYZ"; // static variable is also called class variable
	final double passMarks=40; // Final variable can not be updated
	
	// Default - Non Parameterized Constructor
	Student(){	
	}
	
	
	// Parameterized Constructor
	Student(int roll, String name, double marks) {
		this.roll = roll;
		this.name = name;
		this.marks=marks;
	}
	
	Student(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}
	
	// Behavior - Instance methods
	void display() {
		//System.out.println("Roll = "+this.roll + " | Name = "+this.name + " | Marks = "+this.marks);
		System.out.println("Roll = "+roll + "| Name = "+name + "| Marks = "+marks + "| School = "+school);
	}
	
	void insertDetail(int roll, String namex, double marks) {
		this.roll = roll;
		name = namex;
		this.marks=marks;
	}
	

}
