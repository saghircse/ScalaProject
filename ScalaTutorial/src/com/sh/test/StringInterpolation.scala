package com.sh.test

object StringInterpolation {
  
  def main(args: Array[String]): Unit = {
    
     /**
     * Documentation Comment
     * Author : Saghir
     * Description : String Interpolation Demo
     */
    
    // Single Line Comment
    
    /*
     This is multiline
     Comment
     hhjksa
     */
    

    
    var name = "Raj"
    //var mark = 70.5
    var mark = 70.5
    
    // Concatenation
    println(name +" has got "+mark+" marks") 
    
    val str1 = name +" has got "+mark+" marks"
    println(str1)
    
    // s - Interpolation - Not Type Safe
    println(s"$name has got $mark marks")
    
    // s - Interpolation with expression
    val a = 5
    val b = 6
    println(s"Sum of $a and $b is ${a+b}")
    
    
    // f - Interpolation - Type Safe
    //println(f"$name%s has got $mark%d marks")
    println(f"$name%s has got $mark%f marks")
    
    
    // raw - Interpolation
    println(s"Hello\tWorld")
    println(s"Hello \nWorld")
    
    println(raw"Hello \nWorld")
    
    
    
    
    
  }
  
}