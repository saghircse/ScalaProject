package com.sh.test
import scala.io.StdIn._

object ForLoopDemo {
  def main(args: Array[String]): Unit = {
    
    println("Enter two numbers : ")
    val s = readInt()
    val e = readInt()
    
    println("=====While Loop Demo====")
    var i =s
    while(i<=e){
      
      println(i)
     
      i=i+3
    } 
    
    println("=====For Loop Demo====")
    
    for(j <- 1 to 10){
      println(j)
    }
    
    println("=====For Loop Demo with steps====")
    
    for(j <- s to e by 3){
      println(j)
    }
    
    
    println("=====Sum of all numbers in a range====")
    var sum = 0
    for(j <- s to e ){
      sum = sum + j
    }
    
    println(s"Sum of numbers between $s and $e is $sum")
    
  }
}