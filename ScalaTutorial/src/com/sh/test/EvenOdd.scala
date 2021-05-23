package com.sh.test

object EvenOdd {
  def main(args: Array[String]): Unit = {
    
    val a = 20
    
    // Way -1 : Statement Approach
    if(a%2 == 0){
      println(s"$a is even")
    }else{
      println(s"$a is odd")
    }
    
    // Way -2 : Statement Approach
    var status=""
    if(a%2 == 0){
      status = "even"
    }else{
      status = "odd"
    }
    println(s"$a is $status")
    
    
    // Way -3 : Expression Approach
    var status1= if(a%2 == 0){"even"}else{"odd"}
    
    println(s"$a is $status1")
    
    
    
  }
}