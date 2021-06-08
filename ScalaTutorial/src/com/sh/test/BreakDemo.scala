package com.sh.test

import scala.util.control._

object BreakDemo {
  def main(args: Array[String]): Unit = {
    
    // Create one break object
    val loopBreak = new Breaks;
        
    loopBreak.breakable{
    for(j <- 1 to 10){
      if(j >= 5){
        //break;
        loopBreak.break()
      }
      println(j)
    } // for
    } // loopBreak
  
  }
}