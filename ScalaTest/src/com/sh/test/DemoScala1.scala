package com.sh.test

object DemoScala1 {
  def main(args: Array[String]): Unit = {
    
    
    val x = "Hello "
    val y = "Bern"
    val p = 20
    val z = x + y + p
    println(z)
    
    
    val a = 5.5
    val b = 15
    val sum = a + b
    
    
    // Way-1 : By concatenation ( it does not check data type )
    println("Sum of " + a + " and "+ b + " ="+sum)
    
    // Way-2 : s interpolation
    val s1 = s"Sum of $a and $b = $sum"
    println(s1)
    
    // Way-3 : f interpolation ( it also checks data type )
    val s2 = f"Sum of $a%f and $b%d = $sum%f"
    println(s2)
    
    // Way-4 : raw interpolation 
    println("Hello World")
    println("Hello \nWorld")
    println(raw"Hello \nWorld")
    
    
  }
}