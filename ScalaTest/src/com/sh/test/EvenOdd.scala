package com.sh.test

object EvenOdd {
  def main(args: Array[String]): Unit = {
    //val n = 20
    
    println("Enter a number : ")
    val n = scala.io.StdIn.readInt() // reading Input
    
    /*
    if(n%2 == 0){
      println(s"$n is Even")
    }else{
      println(s"$n is Odd")
    }
    * 
    */
    
    FunctionDemo.checkEvenOdd(n)
    
  }
}