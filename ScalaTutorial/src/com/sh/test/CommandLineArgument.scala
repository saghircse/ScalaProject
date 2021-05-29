package com.sh.test

object CommandLineArgument {
  def main(args: Array[String]): Unit = {
    
    println(args(0))
    println(args(1))
    
    val a = args(0)
    val b = args(1)
    val xa = a+b
    println(xa)
    
    
    val a1 : Int = args(0).toInt
    val b2 = args(1).toInt
    val xa2 = a1+b2
    println(xa2)
    
  }
}