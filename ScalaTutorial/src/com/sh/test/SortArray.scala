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
      
      println("===========Bubble Sort==========")
      //val ar2 = Array(5,10,20,6,2);
      val ar2 = Array(5,10,20,60,200);
      
      // Bubble Sort
      for(i <- 0 to l-1){ 
        var isSwap=0
        for(j <- 0 to l-2-i){
          if(ar2(j)> ar2(j+1)){
            // Swap
            var t = ar2(j)
            ar2(j) = ar2(j+1)
            ar2(j+1) = t
            
            isSwap = isSwap+1
            
          }
        } 
        
        print("==="+"step :"+i)
        ar2.foreach(x => print("   "+x))
        println("")
        
        if(isSwap==0){
          //break
          println("Already Sorted...break it")
        }
        
      }
      
      
      //ar.foreach(x => print("   "+x))
      
    }
    
    
    
}