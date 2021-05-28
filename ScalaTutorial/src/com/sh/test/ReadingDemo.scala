package com.sh.test

import io.StdIn._

object ReadingDemo {
  def main(args: Array[String]): Unit = {
    
    // Reading
    println("Enter 1st number")
    val a = readInt()
    
    println("Enter 2nd number")
    val b = io.StdIn.readInt()
    
    println("Enter name")
    val name = readLine()
    
    
   
    val s = a +b
    println(s"$name has got "+s)
    
  }
}