package com.sh.test

object CommandLineArgument {
  def main(args: Array[String]): Unit = {
    
    // main() method is entry point of any scala/java/c program
    // args : Array[String] - Command Line Argument
    
    
    val len = args.length
    println(s"Number of aruments in command Line = $len")
    
    if(len < 3){
      println("ERROR : Please Enter 3 arguments[roll name fee]")
      System.exit(0)
    }
    
    val roll = args(0).toInt
    val name = args(1)
    val fee = args(2).toDouble
    
    println(s"Roll= $roll | Name= $name | Fee= $fee")
    
  }
}