/**
 * Set : 
 * - It is used to store unique elements.
 * - Insertion order is not maintained
 * - scala.collection.immutable.Set // default 
 * 
 */
package com.sh.collection

import scala.collection.immutable.SortedSet

object SetDemo {
  def main(args: Array[String]): Unit = {
    
    val s0 = Set() // An empty set
    println(s0)
    
    val s1 = Set(3,6,2,9,6) // It does not hold duplicates
    println("s1 = "+s1)
    println(s1.head)      // Returns first elements
    println(s1.tail)      // Returns set of all except first 
    println(s1.isEmpty)   // Return true or false
    
    // Merge two set
    val s2 = Set(8,5,3,1)
    println("s2 = "+s2)
    val s1s2 = s1 ++ s2    // To merge two sets
    println("s1s2 = "+s1s2)
    println("s1 size = "+s1.size)      // 4 
    println("s2 size = "+s2.size)      // 4
    println("s1s2 size = "+s1s2.size)  // 7
    
    println("check 6 in s1 ="+s1.contains(6))    // true
    println("check 10 in s1 ="+s1.contains(10))  // false
    
    // How to add and remove elements
    var sx = Set("SQL","Scala","Spark")
    println("sx ="+sx)
    
    sx = sx + "NLP"      // It will create new Set after adding as set immutable. Only reference is changing.
    println("sx ="+sx)
    
    sx = sx - "SQL"      // It will create new Set after removing as set immutable
    println("sx ="+sx)
    
    // Iterating Set using loop
    println("====================for loop==================")
    for(sub <- sx){
      println(sub)
    }
    
    println("====================for each loop==================")
    sx.foreach{ sub =>
      println(sub)
    } 
    //sx.foreach(sub=>println(sub))
    //sx.foreach(println)
    
    // Intersection and union
    val s1Is2 = s1.intersect(s2)
    println("Intersection of s1 and s2 ="+s1Is2)
    val s1Us2 = s1.union(s2)
    println("Union of s1 and s2 ="+s1Us2)
    
    // Sorted Set
    val ss = SortedSet(3,6,2,9,6)
    
    println("Sorted set ="+ss)
    
    
    
    
    
    
    
  }
}