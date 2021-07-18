package com.sh.oop;

public class Student {
	
	// States - Instance variables 
	int roll;
	String name;
	double marks;
	
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
	
	// Behavior - methods
	void display() {
		//System.out.println("Roll = "+this.roll + " | Name = "+this.name + " | Marks = "+this.marks);
		System.out.println("Roll = "+roll + "| Name = "+name + " Marks = "+marks);
	}
	
	void insertDetail(int roll, String namex, double marks) {
		this.roll = roll;
		name = namex;
		this.marks=marks;
	}
	
	
	

	public static void main(String[] args) {
		
		// How to create object/ instance of a class Student
		Student s1 = new Student();
		Student s2 = new Student();
		System.out.println(s1);
		System.out.println(s2);
		
		// How to initialize object?
		// Way-1 : By reference variable
		s1.roll=1;
		s1.name="Raj";
		s1.marks=80;
		
		// Way-2 : By method
		s2.insertDetail(2,"Ram",70);
		
		// Way-3 : By Constructor
		Student s3 = new Student(3, "Adi", 60);
		Student s4 = new Student(4,"San");
		
		
		// How to access?
		//System.out.println("Roll = "+s1.roll + "| Name = "+s1.name + " Marks = "+s1.marks);
		//System.out.println("Roll = "+s2.roll + "| Name = "+s2.name + " Marks = "+s2.marks);	
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		
		// 
		
		
		

	}

}
