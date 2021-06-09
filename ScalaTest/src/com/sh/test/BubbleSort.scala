package com.sh.test

import scala.io.StdIn._

object BubbleSort {
  def main(args: Array[String]): Unit = {
    
    println("Enter number of elements =")
    val l = readInt()
    
    
    // Insert numbers into array from CLI
    var ar = new Array[Int](l)
    println(s"Enter $l numbers :")    
    for(i <- 0 to l-1){
      ar(i) = readInt()
    }
    
    
    // Sort using bubble sort
    for(i <- 0 to l-1){
      for(j <- 0 to l-2-i){
        
        if(ar(j) > ar(j+1)){
          // Swap
          var t = ar(j)
          ar(j) = ar(j+1)
          ar(j+1) = t
        }
        
      } // for loop -2
    } // for loop -1
    
    
    println("After sorting :")
    for(x <-ar){
      println(x)
    }
    
    
    
    
  }
}