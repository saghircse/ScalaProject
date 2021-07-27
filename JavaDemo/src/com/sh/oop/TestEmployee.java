package com.sh.oop;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(1,"Aditya");
		e1.display();
		
		InternalEmployee e2 = new InternalEmployee(2,"San");
		e2.display();
		
		
		ExternalEmployee e3 = new ExternalEmployee(3,"Raj","TCS");
		e3.display();

	}

}
