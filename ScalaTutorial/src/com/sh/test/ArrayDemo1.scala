package com.sh.test

object ArrayDemo1 {
  def main(args: Array[String]): Unit = {

    //
    println("Enter number of elements to sum=")
    val n = scala.io.StdIn.readInt()
    
    val ax : Array[Int] = new Array[Int](n)
    
    for(i <- 0 to n-1){
      println("Enter element-"+i)
      ax(i) = scala.io.StdIn.readInt()
    }
    
    var s=0
    for(i <- 0 to n-1){
      s = s + ax(i)
    }
    
    var s2=0
    for(x <- ax){
      s2 = s2 + x
    }
    
    var s3=0
    ax.foreach{ x=>
      s3 = s3+x
    }
      
    
    println("Sum ="+s)


    
  }
}