package com.sh.test

object ClosureDemo {
  
  val PASS_MARKS=40 // Free variable
  
  def main(args: Array[String]): Unit = {
    
    val mx= multiply(5)
    println(s"mx = $mx")
    
    val mx2= multiply(5)
    println(s"mx2 = $mx2")
    
    isPassed(45)
    
    isPassed(30)
    
    
    
  }
  
  
  val factor = 3 // Free variable - declared outside of function
  
  // Closure
  def multiply( n : Int) : Int={
    
    val m = n*factor
    
    //factor=2
    
    return m
    
  }
  
  // Normal Function
  def sumOfSquare(x:Int, y:Int) : Int ={
    
    val sos = x*x + y*y
    
    return sos
    
  }
  

  
  def isPassed(mark:Int) : Unit ={
    
    if(mark>=PASS_MARKS){
      println("Exam Passed")
    }else{
      println("Exam Not passed")
    }
    
  }
  
  
  
}