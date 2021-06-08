package com.sh.test

object BinarySearch {
  def main(args: Array[String]): Unit = {
    
    val arrx = Array(2,4,7,9,11,13)
    val y = 3
    
    /*
    val isFound=BinarySearch(arrx,y)
    if(isFound==1){
      println(s" $y is found ")
    }else{
      println("Not Found")
    }
    * 
    */
    
    // Recursion
    val l = arrx.length
    
    val isFound2=BinarySearchRecursion(arrx,y,0,l-1)
    
    if(isFound2==1){
      println(s" $y is found ")
    }else{
      println("Not Found")
    }
    
  }
  
  def BinarySearch(arr : Array[Int],x : Int) : Int ={
    
    val l = arr.length
    
    var lb = 0
    var ub = l-1
    
    while(lb <= ub){
      var mid = (lb + ub)/2
      
      if(x==arr(mid)){
        return 1
      }else if(x<arr(mid)){
        ub = mid -1
      }else{
        lb = mid + 1
      }
      
    }//while loop ends
    
    
    return 0
  }
  
  def BinarySearchRecursion(arr : Array[Int],x : Int, lb:Int, ub:Int) : Int ={
    
    // Base condition  
    if(lb > ub){
       return 0;
    }else{
      var mid = (lb + ub)/2
      if(x==arr(mid)){
        return 1
      }else if(x<arr(mid)){
        return BinarySearchRecursion(arr, x, lb,mid-1)
      }else{
        return BinarySearchRecursion(arr, x, mid+1,ub)
      }  
      
    }

  }
  
  
}