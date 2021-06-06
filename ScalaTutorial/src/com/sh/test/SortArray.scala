package com.sh.test

object SortArray {
    def main(args: Array[String]): Unit = {
      
      // Selection Sort
      
      val ar = Array(5,10,20,6,2);
      
      ar.foreach(x => print("   "+x))
      println("")
      
      val l = ar.length
      
      for(i <- 0 to l-2){ 
        for(j <- i+1 to l-1){
          if(ar(i)> ar(j)){
            var t = ar(i)
            ar(i) = ar(j)
            ar(j) = t
            
          }
        } 
        print("==="+"step :"+i)
        ar.foreach(x => print("   "+x))
        println("")
      }
      
      
      // Bubble Sort
      for(i <- 0 to l-1){ 
        for(j <- 0 to l-2){
          if(ar(j)> ar(j+1)){
            var t = ar(j)
            ar(j) = ar(j+1)
            ar(j+1) = t
            
          }
        } 
        print("==="+"step :"+i)
        ar.foreach(x => print("   "+x))
        println("")
      }
      
      
      //ar.foreach(x => print("   "+x))
      
    }
    
    
    
}