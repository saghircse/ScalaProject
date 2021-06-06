package com.sh.test

import scala.io.StdIn._

object WhileLoopDemo {
  def main(args: Array[String]): Unit = {
    
    println("Enter two numbers : ")
    val s = readInt()
    val e = readInt()
    
    var i = s
    
    // Demo -1 : While Loop
    println("======Example-1 : While Loop=====")
    while(i<=e){
      
      println(i)
     
      i=i+1
    } 
    
    
    // Demo -2 : do while Loop
    println("======Example-2 : Do while Loop=====")
    var k = s
    do{
      
      println(k)
      k =k+1
      
    }while(k<=e)
    
    
    
    println("======Example-3=====")
    var j = s
    // Example-3
    while(j<=e){
      
      if(j%2==0){
        println(j)
      }
      j=j+1
    } 
    
    
    
  }
}