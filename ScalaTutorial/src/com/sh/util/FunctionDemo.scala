package com.sh.util

object FunctionDemo {
  def main(args: Array[String]): Unit = {
    
    sumx(3)
    sumx(3,5)
    sumx(3,5,8)
    
    SquareOfsum(2,4)
    
    
    
    val s1 = sumy(5)(3)
    
    strconcat("Hello", "Scala")
    strconcat2("Hello")( "Scala")
    
    
    multiplier(5,3)
    multiplier(5)
    
    val x = add2(5)
    x(6)
    
  }
  
  // Function with variable number of arguments
  def sumx(args : Int*):Unit={
	  var s=0
	  for(x <- args){
		  s = s+x
	  }
	 println(s"Sum=$s")

  }
  
  def sum(a:Int,b:Int):Unit={
	  var s=a+b
	 println(s"Sum=$s")

  }
  
  // Nested Function
  def SquareOfsum(a : Int, b:Int):Unit={
	   var s=a+b
	  
	   // Inner function - can not be called from outside
	   def square(x:Int)={
      val y=x*x
      y
     }
	  
	   val sos=square(s)
	   println(s"Square of Sum=$sos")
	   
  }
  
  // 

  
  
  // Function with default parameters
  def multiplier(x : Int, m:Int=10):Unit={
	  var s=x*m
	  
	 println(s"Multiplier=$s")

  }
  
  //Currying Function

  def sumy(a : Int)(b:Int) : Unit ={
	  val s = a+b
	  println("Sum="+s)
  }
  
  def strconcat(s1:String,s2:String) =s1+s2
  def strconcat2(s1:String)(s2:String) =s1+s2 // Currying
  
  // Partially Applied function
  def add2(a: Int) = (b: Int) => {val x=a + b; println(x)};
  
}