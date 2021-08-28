package com.sh.test;

public interface AnimalX {
	public abstract void speak();
	public abstract void sleep();
}

interface DogX extends AnimalX{ // Single Inheritance [Dog <- Animal]
	
}

class CatX implements AnimalX{
	public void speak() {
		System.out.println("CatX Speaking....Meaooooo");
	}
	public void sleep(){
		System.out.println("CatX Sleeping....Zzzzz");
	}
}

abstract class CamelX implements AnimalX{
	// Overriding 
	public void sleep(){
		System.out.println("Dog Sleeping....Zzzzz");
	}
}

class TommyCatX extends CatX  { // Multi-level Inheritance [TommyCat <- Cat <- Animal]
}

// Multiple Inheritance is not supported in Java using class but supported using interface
class CatDogX extends CatX  implements DogX,AnimalX{

	// Overriding 
	public void sleep(){
		System.out.println("CatDogX Sleeping....Zzzzz");
	}
}