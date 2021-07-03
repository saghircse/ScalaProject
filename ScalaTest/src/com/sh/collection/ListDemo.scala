package com.sh.collection

object ListDemo {
  def main(args: Array[String]): Unit = {
    val l0 = List() // An empty set
    println(l0)
    
    val l1 = List(3,6,2,9,6) // It holds duplicates
    println("l1 = "+l1)
    println(l1.head)      // Returns first elements
    println(l1.tail)      // Returns set of all except first 
    println(l1.isEmpty)   // Return true or false
    
    // Merge two set
    val l2 = List(8,5,3,1)
    println("l2 = "+l2)
    val l1l2 = l1 ++ l2    // To merge two list
    println("l1l2 = "+l1l2)
    println("l1 size = "+l1.size)      // 4 
    println("l2 size = "+l2.size)      // 4
    println("l1l2 size = "+l1l2.size)  // 7
    
    println("check 6 in l1 ="+l1.contains(6))    // true
    println("check 10 in l1 ="+l1.contains(10))  // false
    
    // Sorted List
    val ls = l1.sorted
    println("Sorted ="+ls)
    
    println("Sorted reverse ="+l1.sorted(Ordering[Int].reverse))
    
    // Reverse List
    val lrev = l1.reverse
    println("Reverse l1 ="+lrev)
    
    // How to add and remove elements
    var lx = List("SQL","Scala","Spark")
    println("lx ="+lx)
    
    //lx = lx + "NLP"      // It will create new Set after adding as set immutable. Only reference is changing.
    //println("lx ="+lx)
    
    //lx = lx - "SQL"      // It will create new Set after removing as set immutable
    //println("sx ="+sx)
    
    // Iterating Set using loop
    println("====================for loop==================")
    for(sub <- lx){
      println(sub)
    }
    
    println("====================for each loop==================")
    lx.foreach{ sub =>
      println(sub)
    } 
    //sx.foreach(sub=>println(sub))
    //sx.foreach(println)
    
    // Intersection and union
    val l1Il2 = l1.intersect(l2)
    println("Intersection of l1 and l2 ="+l1Il2)
    val l1Ul2 = l1.union(l2)
    println("Union of l1 and l2 ="+l1Ul2)

  }
}