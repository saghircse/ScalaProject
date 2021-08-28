package com.sh.test;

public class TestAnimal {

	public static void main(String[] args) {
		
		//Animal a1 = new Animal(); // Can not create object of abstract class
		//a1.sleep();

		
		Dog d1 = new Dog();
		d1.sleep();
		d1.speak();
		
		Cat c1 = new Cat();
		c1.sleep();
		c1.speak();
		
		//Camel cm= new Camel(); // Can not create object of abstract class
		
		TommyCat tc = new TommyCat();
		tc.speak();
		tc.sleep();
		
		CatDogX cd= new CatDogX();
		cd.sleep();
		cd.speak();
	}

}
