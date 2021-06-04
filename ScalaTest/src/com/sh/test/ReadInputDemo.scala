package com.sh.test

import scala.io.StdIn._

object ReadInputDemo {
  def main(args: Array[String]): Unit = {
    
    println("Enter you name :")
    //val name = scala.io.StdIn.readLine()
    val name = readLine()
    
    println("Enter Roll Number :")
    //val roll = scala.io.StdIn.readInt()
    val roll = readInt()
    
    println("Enter Score :")
    //val score = scala.io.StdIn.readFloat()
    val score = readFloat()
    
    println(s"Roll = $roll | Name = $name | Score = $score")
    
  }
}