package com.sh.test;

public class TestStudent {

	public static void main(String[] args) {
		
		Student s1 = new Student(); // Creating object
		//s1.setRoll(1); s1.name="Raj"; s1.marks=60;
		//setStudentValue(s1,1,"Raj",60);
		s1.setStudentValue(1, "Raj", 60);
		//s1.SCHOOL="PQR";
		Student.SCHOOL="KBC";
		//Student.PASSMARKS=30; final variable can not be changed
		
		
		//System.out.println("Roll ="+s1.roll+" Name = "+s1.name+" Marks = "+s1.marks);
		//display(s1);
		s1.display();
		
		Student s2 = new Student();
		//s1.setRoll(1); s2.name="Ram"; s2.marks=50;
		//setStudentValue(s2,2,"Ram",50);
		s2.setStudentValue(2, "Ram", 50);
		
		//System.out.println("Roll ="+s2.roll+" Name = "+s2.name+" Marks = "+s2.marks);
		//display(s2);
		s2.display();
		
		
		
		Student s3 = new Student(3, "Sam", 30);
		s3.display();
		
		Student s4 = new Student(3, "Sam");
		s4.display();
		
		
		

	}
	
	static void display(Student s) {
		System.out.println("Roll ="+s.getRoll()+" Name = "+s.name+" Marks = "+s.marks);
	}
	
	static void setStudentValue(Student s, int roll, String name, int marks) {
		
		s.setRoll(roll);
		s.name=name;
		s.marks=marks;
		
	}

}
