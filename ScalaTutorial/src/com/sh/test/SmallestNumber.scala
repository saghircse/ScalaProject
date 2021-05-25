package com.sh.test

object SmallestNumber {
   def main(args: Array[String]): Unit = {
     val a=20
     val b=10
     val c=5
     
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