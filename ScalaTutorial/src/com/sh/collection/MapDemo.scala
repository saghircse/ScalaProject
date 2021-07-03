package com.sh.collection

object MapDemo {
  def main(args: Array[String]): Unit = {
    
    val mp1 = Map("name" -> "raj","subject" -> "Maths")
    
    var mp2 = Map(("name" , "raj"),("subject" , "Maths"))
    
    val mp0 = Map.empty[String,Int]
    
    println("mp0 ="+mp0)
    println("mp1 ="+mp1)
    println("mp2 ="+mp2)
    
    // Access
    println("name = "+mp1("name"))
    println("Subject = "+mp1.get("subject"))
    //println("XXXX = "+mp1("age"))
    
    // Adding or removing
    
    mp2 = mp2 + ("marks"->"60")
    println("mp2 ="+mp2)
    
    mp2 = mp2 - ("subject")
    println("mp2 ="+mp2)
    
    val age = mp2.get("age")
    println("Age ="+age)
    println("Age ="+mp2.getOrElse("age", "20"))
    
    
  }
}