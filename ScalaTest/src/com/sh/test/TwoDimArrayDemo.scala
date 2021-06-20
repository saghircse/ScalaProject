package com.sh.test

object TwoDimArrayDemo {
  def main(args: Array[String]): Unit = {
    
    println("=========Array-1===========")
    var a = Array( Array(2, 3, 4),Array(5, 6, 7),Array(8, 9, 1) )
    print2DArray(a)
    
    println("=========Array-2===========Different size of rows===")
    var a2 = Array( Array(2, 3, 4,8),Array(5, 6),Array(8, 9, 1,10,4) )
    print2DArray(a2)
    
    println("=========Array-3===========")
    
    
    println("Enter number of rows and cols=")
    val nr = scala.io.StdIn.readInt()
    val nc = scala.io.StdIn.readInt()
    var ax = Array.ofDim[Int](nr,nc)
    
    println("Enter all elements of 2D array :")
    for(r <- 0 to nr-1){
      
      for(c <- 0 to nc-1){
        ax(r)(c) = scala.io.StdIn.readInt()
      }

    }
    
    print2DArray(ax)
    
    
    
    
    
  }
  
  def print2DArray(a:Array[Array[Int]]) ={
    
    val nrow = a.length
    
    for(r <- 0 to nrow-1){
      val ncol = a(r).length
      
      for(c <- 0 to ncol-1){
        print(a(r)(c)+" ")
      }
      
      println("")
    }
    
  }
  
}