package com.sh.util

object PalindromeNumber {
  def main(args: Array[String]): Unit = {
    
    val n = 2345
    
    val rev = reverseNum(n)
    
    //var rv1 = n.toString().reverse.toInt
    
    if(rev == n){
      println("Palindrom")
    }else{
      println("Not Palindrom")
    }
  }
  
  
  def reverseNum(y : Int) : Int ={
    
    var x = y
    var r = 0
    var rev = 0
    
    while(x !=0){
      r = x%10
      rev = rev * 10 + r
      x = x/10
    }
   
    return rev // return keyword is optional
    
  }
  
  
  
  
  
}