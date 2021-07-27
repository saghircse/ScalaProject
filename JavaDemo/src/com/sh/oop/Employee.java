package com.sh.oop;

public class Employee {
	int empId;
	String name;
	final static String COMPANY="Amazon";
	
	Employee(){
		
	}
	
	Employee(int empId, String name){
		this.empId=empId;
		this.name= name;
	}
	
	void display() {
		System.out.println(empId + " | " + name +  " | " + COMPANY);
	}
	
	
	
}


class InternalEmployee extends Employee{
	String type="Permanent";
	InternalEmployee(){
		
	}
	
	InternalEmployee(int empId, String name){
		this.empId=empId;
		this.name= name;
	}
	
}

class ExternalEmployee extends Employee{
	
	String type="Vendor";
	String vendorName;
	
	ExternalEmployee(){
		
	}
	
	ExternalEmployee(int empId, String name, String vendorName){
		this.empId=empId;
		this.name= name;
		this.vendorName= vendorName;
	}
	
}
