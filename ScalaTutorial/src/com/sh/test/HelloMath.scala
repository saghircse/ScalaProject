package com.sh.test

import com.sh.util.MathUtil

object HelloMath {
  def main(args: Array[String]): Unit = {
    
    val a = 10;
    val b = 5;
    
    val s = MathUtil.sum(a,b)
    val m = MathUtil.multiply(a,b)
    
    println("Sum = "+s)
    println("Multiply = "+m)
  }
  
}