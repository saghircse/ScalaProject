package com.sh.collection

object ListDemo {
  def main(args: Array[String]): Unit = {
    
    val l0 = List()
    val l1 = List(3,4,7,4,9,6)
    
    println(l0)
    println(l1)
    
    
    println(l1.head)      // Return sFirst element
    println(l1.tail)      // Return set of all elements except first
    println(l1.isEmpty)   // Return true/false 
    
    // Merge two Lists
    val l2 = List(7,5,2,10,4)
    println("l2 ="+l2)
    val l1l2 = l1 ++ l2
    println("l1l2 ="+l1l2)
    
    // Intersection and Union
    
    val l1Il2 = l1.intersect(l2)
    println("l1 intersect l2 ="+l1Il2)
 
    val l1Ul2 = l1.union(l2)
    println("l1 union l2 ="+l1Ul2)
    
        // Iterate using Loop
     println("Iterate using for loop")
    val ss = List("Scala","Java","Spark")
    for(sub <- ss){
      println(sub)
    }
    
    // Iterate through for each
    println("Iterate using for each")
    ss.foreach{ sub =>
      println(sub)
    }
    
    //ss.foreach(sub => println(sub) )
    //ss.foreach(println )
    
    // Sorting List
    println("Sorted List ="+l1.sorted)
    
    // Convert list to set or set to list
    l1.toSet.toSet
    
  }
}