package com.sh.test

object StringDemo {
  def main(args: Array[String]): Unit = {
    
    val s1 = " Hel  lo "
    val s2 : String = " Scala"
    
    // Find Length
    println(s1.length())
    
    // Concat 
    val x0 = s1+s2
    val x1 = s1.+(s2)
    val x2 = s1.concat(s2)
    val x3 = "I".concat(" ").concat("am").concat(" ").concat("good")
    
    // 
    
    println(s1.charAt(2))
    println(s1.equals("hello"))
    println(s1.equalsIgnoreCase("hello"))
    
    val l1 = s1.length()
    
    println(s1.trim())
    
    println(s1.replaceAll(" ", "*"))
    
    //
    
    val ss = "11 San 2000"
    
    val aa = ss.split(" ")
    
    val id = aa(0).toInt
    val name = aa(1).toUpperCase()
    val sal = aa(2).toLong
    
    val st1 = s1.endsWith("o")
    
    println("===========")
    
    println(Byte.MaxValue)
    println((Byte.MaxValue+1).toByte)
    println((Byte.MaxValue+2).toByte)
    
    
    
    
    
    
  }
}