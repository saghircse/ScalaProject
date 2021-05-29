package com.sh.test

object ArrayDemo {
  def main(args: Array[String]): Unit = {
    
    val a = 5;
    val b : Int = 6;
    
    // Creating Array - way1
    val ar1 = Array(5,10.5,20,6,true,'A',"Raju");
    val ar2 : Array[Int] = Array(5,20,6);
    val ar3 : Array[String] = Array("Sun","Mon","Tue");
    
    println(ar3(0))
    ar3(0)="Sunday"
    println(ar3(0))
    
    //println(ar3(4))  // java.lang.ArrayIndexOutOfBoundsException
    
    println("=============================")
    for(i<-ar2){
      println(i)
    }
    
    var s = 0
    for(i<-ar2){
      s = s+i
    }
    println("Sum ="+s)
    
    
    println("====================Way-2")
    
    // Creating Array - way2
    val ax : Array[String] = new Array[String](5)
    ax(0)="Sun"
    ax(1)="Mon"
    ax(2)="Tue"
   for(i<-ax){
      println(i)
    }
    
  }
}