package com.sh.test;

public abstract class Animal {
	public abstract void speak();
	public void sleep(){
		System.out.println("Sleeping....Zzzzz");
	}
}

class Dog extends Animal{ // Single Inheritance [Dog <- Animal]
	
	public void speak() {
		System.out.println("Dog Speaking....BhoBhoBhooo");
	}
	
	// Overriding 
	public void sleep(){
		System.out.println("Dog Sleeping....Zzzzz");
	}
}

class Cat extends Animal{
	public void speak() {
		System.out.println("Cat Speaking....Meaooooo");
	}
}

abstract class Camel extends Animal{
	// Overriding 
	public void sleep(){
		System.out.println("Dog Sleeping....Zzzzz");
	}
}

class TommyCat extends Cat  { // Multi-level Inheritance [TommyCat <- Cat <- Animal]
}

// Multiple Inheritance is not supported in Java
// class CatDog extends Cat,Dog {}