package com.sh.test

import scala.util.Random

object PatternMatchingDemo {
  def main(args: Array[String]): Unit = {
    
    //println("Enter a number :")
    //val n = scala.io.StdIn.readInt()
    
    val n = Random.nextInt(10) // This will give random number from 0 to 9
    
    //println(Random.nextString(5))
    
    
    checkUsingIf(n)
    checkUsingPatternMatch(n)
    
    
    
    
  }
  
  def checkUsingPatternMatch(n  : Int){
    
    n match {
      case 0 => println("Zero")
      case 1 => println("One")
      case 2 => println("Two")
      case 3 => println("Three")
      case 4 => println("Four")
      case 5 => println("Five")
      case 6 => println("Six")
      case 7 => println("Seven")
      case 8 => println("Eight")
      case 9 => println("Nine")
      case _ => println("Not a digit")
    }
    
  }
  
  
  def checkUsingIf(n:Int){
    if(n==0)
			println("Zero")
		else if(n==1)
			println("One")
		else if(n==2)
			println("Two")	
		else if(n==3)
			println("Three")
		else if(n==4)
			println("Four")	
		else if(n==5)
			println("Five")
		else if(n==6)
			println("Six")	
		else if(n==7)
			println("Seven")
		else if(n==8)
			println("Eight")	
		else if(n==9)
			println("Nine")	
		else
			println("Not a digit")
    
  }
  
}