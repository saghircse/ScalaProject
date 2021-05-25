package com.sh.test

object ForLoopDemo {
  def main(args: Array[String]): Unit = {
    
    val r1 = 1 to 10
    val r2 = 1 until 10

    // For each loop
    for(i <- 1 to 10 if i%2==0){
      
      println(i)
    }
    
    println("--------------------")
    for(i <- 1 until 10){
      println(i)
    }
    
    println("--------------------")
    val lst = List("cat","dog",5,11,10)
    for(i <- lst){
      println(i)
    }
    
    
    
  }
}