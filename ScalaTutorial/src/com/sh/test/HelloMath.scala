package com.sh.test

import com.sh.util.MathUtil._

object HelloMath {
  def main(args: Array[String]): Unit = {
    
    val a = 10;
    val b = 5;
    
    val s = sum(a,b)
    val m = multiply(a,b)
    
    println("Sum = "+s)
    println("Multiply = "+m)
  }
  
}