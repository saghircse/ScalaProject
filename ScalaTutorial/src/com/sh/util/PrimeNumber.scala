package com.sh.util

object PrimeNumber {
    def main(args: Array[String]): Unit = {
      
      val N : Int = 22
      
      println(N)
      
      var flag = 0
      
      for(x <- 2.to((N-1)/2)){ 
        
        if( N%x == 0){
          flag=1 
        }
      }
      
      if(flag==0){
        println("Prime")
      }else{
        println("Not Prime")
      }
      
    }
}