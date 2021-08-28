package com.sh.test;

public class Student {
	private int roll;
	public String name;
	public float marks;
	static String SCHOOL="XYZ";
	final static float PASSMARKS=40;
	
	// Non parameterized construtor - default constructor
	Student(){
	}
	
	
	// Parameterized construtor - user defined
	Student(int roll,String name, float marks){
		this.roll=roll;
		this.name=name;
		this.marks=marks;
		
	}
	
	Student(int roll,String name){
		this.roll=roll;
		this.name=name;
		
	}
	
	
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
		
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	void display() {
		System.out.println("Roll ="+this.roll+" Name = "+name+" Marks = "+marks + " School ="+SCHOOL);
	}
	
	void setStudentValue(int roll, String name, int marks) {
		
		this.setRoll(roll);
		this.name=name;
		this.marks=marks;
	}
	
	void setStudentValue(int roll, String name) {
		
		this.setRoll(roll);
		this.name=name;
	}
	
	
}
