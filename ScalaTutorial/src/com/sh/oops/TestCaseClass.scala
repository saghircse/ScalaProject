package com.sh.oops

case class StudentC(roll:Int,name:String,marks:Int)

object TestCaseClass {
  def main(args: Array[String]): Unit = {
    
    // Case Class:
    // 1. public 2. Immutable 3. new keyword not required
    
    val s = StudentC(2,"Raj",50)
    
    println("name = "+s.name)
    
    //s.name = "Raj"
    
  }
}