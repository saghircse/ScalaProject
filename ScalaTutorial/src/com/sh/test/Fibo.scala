package com.sh.test

object Fibo {
    def main(args: Array[String]): Unit = {
      
      val N=10
      var a = 0
      var b = 1
      
      println(a)
      println(b)
      
      for(i <- 3 to N){
        var t = a+b
         println(t)
         a = b
         b = t
      }
      
      println("------------------------")
      a =0
      b= 1
      var t1 = a+b
      while(t1<=N){
        println(t1)
        a = b
        b = t1
        t1 = a+b 
      }
      
    }
}