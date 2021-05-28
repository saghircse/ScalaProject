package com.sh.test

object ForLoopDemo {
  def main(args: Array[String]): Unit = {
    
    val r1 = 1 to 10
    val r2 = 1 until 10

    // for loop - Range using to
    for(i <- 1 to 10 ){
      println(i)
    }
    
    // for loop - Range using until
    println("--------------------")
    for(i <- 1 until 10){
      println(i)
    }
    
     // for loop - Filtering
    for(i <- 1 to 10 if i%2==0){
      
      println(i)
    }
    
    // for loop - On Collection 
    val lst = List("cat","dog",5,11,10)
    for(x <- lst){
      println(x)
    }
    
    
    // for each - On Collection 
    lst.foreach{ x => println(x) }
    lst.foreach( x => println(x) )
    lst.foreach(println(_))
    lst.foreach(println)
    
    // for loop - using yield keyword
    var result = for( a <- 1 to 10 if a%2==0) yield a  
    
    
    for(i<-result){  
       println(i)  
    }  
    
    
    
  }
}