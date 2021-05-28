package com.sh.test

import io.StdIn._

object SmallestNumber {
   def main(args: Array[String]): Unit = {
     
     
     println("Enter 3 numbers")
     val a=readInt()
     val b=readInt()
     val c=readInt()
     
     // Nested if-else
     if(a<b){
       if(a<c){
         println(s"$a is the smallest")
       }else{
         println(s"$c is the smallest")
       }
     }else{
       if(b<c){
         println(s"$b is the smallest")
       }else{
         println(s"$c is the smallest")
       }
     }
     
     
     // Way-2
     if(a<b && a<c){
       println(s"$a is the smallest")    
     }else{   
       if(b<c){
         println(s"$b is the smallest")  
       }else{
         println(s"$c is the smallest")  
       }
     }
     
     // Way-2
     if(a<b && a<c){
       println(s"$a is the smallest")    
     }else if(b < c){
       println(s"$b is the smallest") 
     }else{
       println(s"$b is the smallest") 
     }
     
     
     
   }
}