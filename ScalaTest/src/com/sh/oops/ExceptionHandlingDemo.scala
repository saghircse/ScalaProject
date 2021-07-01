package com.sh.oops

object ExceptionHandlingDemo {
  def main(args: Array[String]): Unit = {
    
    println("Enter two number :")
    
    var a : Int=0
    var b : Int=0
    var d : Int=0
    
    try{
      println("========>Inside try block")
      a = scala.io.StdIn.readInt()
      b = scala.io.StdIn.readInt()
      d = a/b
      
    }catch{
      // Only if any exception occurs
      case e : NumberFormatException => println("NumberFormatException : Enter numbers only")
      case e : ArithmeticException => println("ArithmeticException : Diviser can not be zero")
      //case e : Exception => println("Handle all kind of Exception")
      //System.exit(0)
      println("========>Inside catch block")
    }finally{
      // Always executed
      println("========>Finaly block always executes")
    }
    
    
    println("=========>Out side try and catch")
    
    println(s"$a divided by $b = $d")
    
  }
}