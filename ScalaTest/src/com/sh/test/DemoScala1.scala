package com.sh.test

object DemoScala1 {
  def main(args: Array[String]): Unit = {
    
     // Immutable - value can not be changed
      val ay = 10   
      //ay = 15
      
      // Mutable - value can be changed
      var bx = 5
      bx = 13
    
    
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
    
    
          val a1 = 10.5 // Double
      val b1 : Int = 20 // Int
      
      val c = 'A' // Character
      
      val name = "Bern" // String
      
      val flag = true // Boolean
      
      println(Byte.MaxValue)
      println(Int.MaxValue)
      println(Long.MaxValue)
    
    
  }
}