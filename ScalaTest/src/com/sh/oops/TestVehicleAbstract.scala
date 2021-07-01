package com.sh.oops

object TestVehicleAbstract {
  
  
  abstract class Vehicle{
    
    // horn : implemented method : method with definition -> non-abstract method
    def horn(){
      println("Vehicle : Blow horn")
    }
    
    
    // start(), stop() : unimplemented method : method without definition -> abstract method
    def stop() 
    def start()
    
    
    
  }
  
  class Bike extends Vehicle{
    override def horn(){
      println("Bike : Blow horn")
    }
    
    def start(){
      println("Bike : Started")
    }
    
    def stop(){
      println("Bike : Stopped")
    }
    
  }
  
  class Car extends Vehicle{
    override def horn(){
      println("Car : Blow horn")
    }
    
    def start(){
      println("Car : Started")
    }
    
    def stop(){
      println("Car : Stopped")
    }
    
  }
  
  // Multiple inheritance is not supported through class
  //class HybridCarBike extends Car with Bike {}
  
  
  
  
  
  def main(args: Array[String]): Unit = {
    
    val b = new Bike()
    b.horn()
    b.start()
    b.stop()
    
    val c = new Car()
    c.horn()
    c.start()
    c.stop()
    
  }
}