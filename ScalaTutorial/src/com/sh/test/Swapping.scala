package com.sh.test

object Swapping {
  def main(args: Array[String]): Unit = {
    var a = 7
    var b = 10
    
    var percent = 80.5
    var grade='O'
    var name="Raj"
    var flag = false
    
    println("Before Swapping :")
    println("a = "+a)
    println("b = "+b)
    
    //Swapping
    var c = a
    a = b
    b = c
    
    println("After Swapping :")
    println("a = "+a)
    println("b = "+b)
    
  }
}