package com.sh.oops

class Employee{
  println("Default Constructor")
}

class Employee2( id : Int, name : String ){ // Primary Constructor
  println("Primary Constructor")
  var age:Int=0
  
  def this(id : Int, name : String,age:Int){ // Secondary 
    this(id,name) // Calling Primary Constructor
    this.age=age
  }
  
  def display(){
    
    println(id +" | "+name+" | "+age)
  }
  
  
    
}



object TestEmployee {
    def main(args: Array[String]): Unit = {
      new Employee()
      
      val e1 = new Employee2(2,"Raj")
      e1.age=40
      e1.display()
      
      val e2 = new Employee2(2,"Raj",50)
      
      
    }
}