package com.sh.test

object IfElseDemo {
  def main(args: Array[String]): Unit = {
    
    val a = 2
    val b = 5
    val c = 7
    
    // Greatest of three numbers 
    // Demo of if-else-if ladder
    if(a>=b && a>=c){
      println(s"$a is the greatest")
    }else if(b>=a && a>=c){
      println(s"$b is the greatest")
    }else{
      println(s"$c is the greatest")
    }
    
    
    // Demo of Nested if-else
    if(a>=b){
      //a
      if(a>=c){
        println(s"$a is the greatest")
      }else{
        println(s"$c is the greatest")
      }
      
    }else{
      //b
      if(b>=c){
        println(s"$b is the greatest")
      }else{
        println(s"$c is the greatest")
      }
    }
    
    
  }
}