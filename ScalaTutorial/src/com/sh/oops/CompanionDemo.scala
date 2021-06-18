package com.sh.oops

class CompanionDemo{
  
  def display(){
    println("CompanionDemo - Companion Class")
  }
  
}

object CompanionDemo {
  def main(args: Array[String]): Unit = {
    
    val cd1=new CompanionDemo()
    
    cd1.display()
    
    println("CompanionDemo - Companion Object")
  }
}