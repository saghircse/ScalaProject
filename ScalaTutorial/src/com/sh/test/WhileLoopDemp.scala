package com.sh.test

object WhileLoopDemp {
  def main(args: Array[String]): Unit = {
    
    
    
    // While Loop
    val N = 10
    var i=11
    while(i<=N){
      
      println(i) 
      
      i=i+1
    }
    
    println("===========================")
    // do-while Loop
    var j=11
    do{
      println(j)  
      j=j+1
    }while(j<=N)
      
    
    
  }
}