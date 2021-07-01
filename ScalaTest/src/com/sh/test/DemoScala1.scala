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
    
    // Way-0 : By concatenation 
    println("Sum of " + a + " and "+ b + " ="+sum)
    
    // Way-1 : s interpolation ( it does not check data type )
    println(s"Sum of $a and $b = $sum")
    // Use curly braces {} to evaluate an expression 
    println(s"Sum of $a and $b = ${a+b}")
    
    // Way-2 : f interpolation ( it also checks data type )
    println(f"Sum of $a%f and $b%d = $sum%f")
    
    // Way-3 : raw interpolation 
    println("Hello \nWorld")    // It will print Hello and World in separate lines. 
    println(raw"Hello \nWorld") // It will print Hello \nWorld as it is. 
    
    
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