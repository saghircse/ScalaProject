package com.sh.test

object StringDemo {
  def main(args: Array[String]): Unit = {
    
    var greet1 = "Hello Scala"
    
    var greet2 : String = "Hello Scala";
    println(greet2)
    
    // Find the length of String
    var len = greet1.length()
    println(s"Length = $len")
    
    // Concatination
    var s1 = "Learning"
    var s2 = " Scala"
    
    val c1= s1+s2+" and Spark"
    println(c1)
    
    val c0 = s1.+(s2)
    println(c0)
    
    val c2 = s1.concat(s2).concat(" and Spark")
    println(c2)
    
    val c3 = s1 concat s2
    println(c3)
    
    // Trim
    val x1 = "   Sag hir "
    x1.trim()
    x1.toUpperCase()
    x1.toLowerCase()
    
    
    val y1 = "san"
    val y2 = "fan"
    
    y1.equals(y2)
    
    y1.equalsIgnoreCase(y2)
    
    y1.endsWith(y2)
    
    y1.indexOf('a')
    
    
    y1.compareTo(y2)
    y1.compareToIgnoreCase(y2)
    y1.compare(y2)

    
    val x = "This is scala. I am learning scala."
    
    x.replaceAll("scala", "Spark")
    
    x.reverse
    
    

/*    
scala> val s1 = "1,Bern,Austria,39"
s1: String = 1,Bern,Austria,39

scala> var ar = s1.split(",")
ar: Array[String] = Array(1, Bern, Austria, 39)

scala> val id = ar(0)
id: String = 1

scala> val name = ar(1)
name: String = Bern

scala> val country = ar(2)
country: String = Austria

scala> val age = ar(3)
age: String = 39
* 
*/
    
    
    
    
  }
}