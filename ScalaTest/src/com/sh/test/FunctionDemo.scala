package com.sh.test

object FunctionDemo {
  def main(args: Array[String]) : Unit = {
    
    println("Enter two Numbers :")
    val a = scala.io.StdIn.readInt()
    val b = scala.io.StdIn.readInt()
    
    checkEvenOdd(a)
    checkEvenOdd(b)
    checkEvenOdd(15)
    checkEvenOdd(30)
    
    val sox = sumOfSquare(a,b)
    println(s"Sum of square of $a and $b = $sox ")
    
  }
  
  
  
  def sumOfSquare(x:Int, y:Int) : Int ={
    val sos = x*x + y*y
    
    return sos
    //sos      // return keyword is optional
    
  }
  
//  def checkEvenOdd(a:Int) : Unit ={
  def checkEvenOdd(a:Int)  ={    
    if(a%2 == 0){
      println(s"$a is Even")
    }else{
      println(s"$a is Odd")
    }
    
  }
  
  
}