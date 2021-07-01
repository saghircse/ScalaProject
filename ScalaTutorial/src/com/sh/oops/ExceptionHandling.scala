package com.sh.oops

object ExceptionHandling {
  def main(args: Array[String]): Unit = {
    
    println("Enter two numbers :")
    try{
      val a = scala.io.StdIn.readInt()
      val b = scala.io.StdIn.readInt()
    
      val c = a/b
    
      println(s"$a divided by $b = $c")
    
    }catch{
      case e : NumberFormatException => println("Enter valid numbers") 
      case e : ArithmeticException => println("Divide by zero not possible") ; System.exit(0)
      case _ : Exception => println("Something wrong happended")
    }finally{
      println("finally block is always executed")
    }
    
    println("Continue next....")
    
  }
}