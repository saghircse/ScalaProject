package com.sh.oops


object SigletonStudent{
  def display(){
    println(9999 +" | "+"XX Singleton XXX")
  }
}

class Student{
  println("Student Class called")
  var roll:Int = 0;
  var name : String = null; 
  
  def display(){
    println(roll +" | "+name)
  }
    
}

class StudentY( roll : Int, name : String ){ // Primary Constructor
  println("Student Class called")
  var rollx:Int = roll; // Using Variable
  def namex : String = name; // Using method
  
  def display(){
    println(roll +" | "+name)
  }
    
}

class StudentX( val roll : Int, var name : String ){ // Primary Constructor
  println("Student Class called")
  //var roll:Int = 0;
  //var name : String = null; 
  
  
  def display(){
    println(roll +" | "+name)
  }
    
}

object TestStudent {
  def main(args: Array[String]): Unit = {
    
    val s1 = new Student()
    s1.roll = 1
    s1.name = "Raj"
    s1.display()
    
    //println(s1.roll +" | "+s1.name)
     
    var s2 = new StudentX(2,"San")
    s2.display()
    
    val s3 = new StudentY(3,"John")
    s3.display()
    
    // Anonymous object
    new StudentY(4,"Johnous").display()
    
    s2=null
    
    
    // Singleton object : 
    //Dont need to create object...Use variables or methods directly
    SigletonStudent.display()
       
    
  }
}