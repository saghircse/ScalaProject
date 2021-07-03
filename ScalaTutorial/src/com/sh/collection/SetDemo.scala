package com.sh.collection

import scala.collection.immutable.SortedSet
import scala.collection.immutable.TreeSet


object SetDemo {
  def main(args: Array[String]): Unit = {
    
    
    val s0 = Set()
    val s1 = Set(3,4,7,4,9,6)
    
    println(s0)
    println("s1="+s1)
    
    println(s1.head)      // Return First element
    println(s1.tail)      // Return set of all elements except first
    println(s1.isEmpty)   // Return true/false 
    println(s1.size)
    println("7 in s1 ="+s1.contains(7))
    println("10 in s1 = "+s1.contains(10))
    
    // Merge two sets
    val s2 = Set(7,5,2,10,4)
    println("s2 ="+s2)
    val s1s2 = s1 ++ s2
    println("s1s2 ="+s1s2)
    
    // Intersection and Union
    
    val s1Is2 = s1.intersect(s2)
    println("s1 intersect s2 ="+s1Is2)
 
    val s1Us2 = s1.union(s2)
    println("s1 union s2 ="+s1Us2)
    
    // Iterate using Loop
     println("Iterate using for loop")
    var ss = Set("Scala","Java","Spark")
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
    
    // Adding or removing elements from Set
    println("===================================")
    println("Initial ss ="+ss)
    ss = ss + "SQL"
    println("After adding SQL ="+ss)
    ss = ss - "Java"
    println("After removing Java ="+ss)
    
    // Sorting
    val ts = TreeSet(3,4,7,4,9,6)  // TreeSet(Class) is child of SortedSet(Trait)
    val so = SortedSet(3,4,7,4,9,6)
   
    
    println("Sorted set = "+so)
    
    
    
    
    
    
    
  }
}