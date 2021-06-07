package com.sh.test

object ArrayDemo {
  def main(args: Array[String]): Unit = {
    
    // Sigle value Variable
    var a = 10
    //var a : Int = 10
    
    
    // Array - multiple elements
    //var ar = Array(5,10,30,15,8) 
    var ar : Array[Int] = Array(5,10,30,2,8)
    
    // Access elements from array using index
    println(ar(0))
    println(ar(4))
    //println(ar(6)) // ArrayIndexOutOfBoundsException
    
    var b = ar(3)
    println("b = "+b)
    
    // Update using index
    ar(2) = 13
    println(ar(2))
    
    //Find length of array - number of elements in an array
    val n = ar.length
    
    println("===========Way-1 : Using Index==============")
    // Print all elements of array using index
    for(i <- 0 to n-1){
      println(ar(i))
    }
    
    println("===========Way-2==============")
    // Print all elements of array
    for(x <- ar){
      println(x)
    }
    
    
    println("===========Way-3.1==============")
    // Print all elements using foreach
    
    ar.foreach(k=> println(k))
    
    println("===========Way-3.2==============")
    ar.foreach{
      k => println(k)
    }
    
    println("===========Way-3.3==============")
    ar.foreach(println(_))
    
    println("===========Way-3.4==============")
    ar.foreach(println)
    
    
    // Find sum of all elements of array
    var sum = 0
    for(i <- 0 to n-1){
      sum = sum + ar(i)
    }
    println("=========Sum ="+sum)
    
    // Find smallest number
    var min = ar(0) // Assume that ar(0) is smallest number
    for(x <- ar){
      if(x<min){
        min = x
      }
    }
   
    
    
    
    
    
    
    
  }  
  
}