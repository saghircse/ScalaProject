package com.sh.util

object TestClosure {
  def main(args: Array[String]): Unit = {
    
    multiplier(5) // 15
    
    
    factor = 5
    
    multiplier(5) // 25
    
    
    isPass(34)
    isPass(60)
    isPass(33)
    
    
    
  }
  
  // Free varible
  //val factor = 3
  var factor = 3
  
  val PASS_MARKS = 40
  
  // Closure
  def multiplier(x: Int) {
    
    val m = x*factor
    println(s"M = $m")
    
  }
  
  def isPass(mark : Int){
    if(mark<PASS_MARKS){
      println("Fail")
    }else{
      println("Pass")
    }
  }
  
}