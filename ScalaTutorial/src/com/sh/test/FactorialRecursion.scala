package com.sh.test

object FactorialRecursion {
  def main(args: Array[String]): Unit = {
    
    val f = fact(5)
  }
  
  // Recusive Function
  def fact(x:Int):Int = {
    
    // Base condition
    if(x==0 || x == 1){
      return 1
    }else{
      return x * fact(x-1)
    }
    
  }
  
}