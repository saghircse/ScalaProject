package com.sh.test

import scala.util.control._


object LoopBreakDemo {
  def main(args: Array[String]): Unit = {
    
    val loopBreak = new Breaks;
  
    loopBreak.breakable{
      
    for(i <- 1 to 20){
      
      if(i>=5){
        // break - In scala, there is no direct break statement
        loopBreak.break()
        
      }
      
      println(i)
    } // for
    
    }
    
    
    
    
    
    
    
    
    
    
    
  }
}