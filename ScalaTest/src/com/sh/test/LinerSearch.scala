package com.sh.test

import scala.io.StdIn._

object LinerSearch {
  
  def main(args: Array[String]): Unit = {
    
    
    println("Enter number of elements =")
    val l = readInt()
    
    
    // Insert numbers into array from CLI
    var arr = new Array[Int](l)
    println(s"Enter $l numbers :")    
    for(i <- 0 to l-1){
      arr(i) = readInt()
    }
    
    //var arr = Array(3,2,8,7,6)
    //val l = arr.length
    
    println("Enter a number to search : ")
    val n = readInt()
    
    var flag = 0 // assume 0 means not found and 1 means found
    
    for(x <-arr ){
      if(n == x){
        flag =1
      }
    }
    
  
    if(flag==1){
      println(s"$n is Found")
    }else{
      println(s"$n is not Found")
    }
    
    
  }
  
}