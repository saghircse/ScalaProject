package com.sh.test

object PrimeNumber {
  def main(args: Array[String]): Unit = {
    
    println("Enter a number :")
    val n = scala.io.StdIn.readInt()
    isPrime(n)
    
    if(isPrimeX(n)){
      println("Prime")
    }else{
      println("Not prime")
    }
    
    
    println("Prime in range:")
    for(i <- 1 to 50){
      if(isPrimeX(i)){
        print(i+" ")
      }
  
    }
    
    
    
  }
  
  def isPrimeX(x : Int) : Boolean={
    
    var flag = true // 1 (true) - Prime, 0(false) - not prime
    for(i <- 2 to (x-1)/2+1){
      
      if(x%i ==0){
        flag = false // Not prime
      }
    }
    
    flag
  }
  
  
  def isPrime(x : Int) {
    
    var flag = true // 1 (true) - Prime, 0(false) - not prime
    for(i <- 2 to (x-1)/2 +1){
      
      if(x%i ==0){
        flag = false // Not prime
      }
    }
    
    if(flag){
      println("Prime")
    }else{
      println("Not Prime")
    }
    
  }
  
}