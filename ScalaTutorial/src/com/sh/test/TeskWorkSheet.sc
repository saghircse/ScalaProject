package com.sh.test

object TeskWorkSheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  lazy val x =6                                   //> x: => Int = <lazy>
  val y =10                                       //> y  : Int = 10
  val s1 = x+y                                    //> s1  : Int = 16
  val p1 = s1*5                                   //> p1  : Int = 80
  println(p1)                                     //> 80
 	
 	
  lazy val l = 5;                                 //> l: => Int = <lazy>
  lazy val s2 = y+x                               //> s2: => Int = <lazy>
  lazy val p = s2 * l                             //> p: => Int = <lazy>
  println(p)                                      //> 80
  
  
}