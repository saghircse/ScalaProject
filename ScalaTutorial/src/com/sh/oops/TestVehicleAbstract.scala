package com.sh.oops

object TestVehicleAbstract {
  
  abstract class Vehicle{
    
    // Non-abstract method : Method with definition/implementation
    def horn(){
      println("Vehicle : Blow Horn")
    }
    
    // abstract method : Method with no definition, unimplemented method
    def start()
    
    def stop()
    
  }
  
  class Car extends Vehicle {
    override def horn(){
      println("Car : Blow Horn")
    }
    
    def start(){
      println("Car : Started")
    }
    
    def stop(){
      println("Car : Stopped")
    }
    
  }
  
  class Bike extends Vehicle{
    override def horn(){
      println("Bike : Blow Horn")
    }
    
    def start(){
      println("Bike : Started")
    }
    
    def stop(){
      println("Bike : Stopped")
    }
    
  }
  
  class HondaBike extends Bike{
    
  }
  
  // Multiple Inheritance is not supported using class
  /*
  class HybridCarBike extends Bike with Car{ 
        override def horn(){
      println("HybridCarBike : Blow Horn")
    }
    
    override def start(){
      println("HybridCarBike : Started")
    }
    
    override def stop(){
      println("HybridCarBike : Stopped")
    }
    
  } 
  
  */
  
  def main(args: Array[String]): Unit = {
    
    val c = new Car()
    c.horn()
    
    val b = new Bike()
    b.horn()
    
  }
}