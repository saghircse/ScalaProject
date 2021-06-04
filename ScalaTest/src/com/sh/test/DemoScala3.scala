package com.sh.test

object DemoScala3 {
    def main(args: Array[String]): Unit = {
      //val a = 10
      //val b = 5.5
      //val c = "hello"
      
      val (a,b,c) = (10,5.5,"hello")
      println(s"a =$a b=$b c=$c")
      
      val x,y,z = 1
      println(s"x =$x y=$y z=$z")
      
      // Operators
      
      var p = 5
      
      //p = p + 3
      p += 3
      
      println(p)
      
      
      
      
      
      
      
    }
}