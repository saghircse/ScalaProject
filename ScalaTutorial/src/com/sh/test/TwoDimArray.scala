package com.sh.test

object TwoDimArray {
  def main(args: Array[String]): Unit = {
    
    val ar = Array(Array(10,20,30),Array(40,50,60),Array(60,70,80))
    
    //println(ar(0)(1))
    
    //ar.length
    
    
    for(r <- 0 to 2){
      
      for(c <- 0 to 2 ){
        print("\t"+ar(r)(c))
      }
      println("")
    }
  }
}