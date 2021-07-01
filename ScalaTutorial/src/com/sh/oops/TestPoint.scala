package com.sh.oops

class Point(xc :Int, yc:Int){
  
  // States - represented by variables
  var x : Int = xc
  var y : Int = yc
  
  // Behaviour - represented by methods
  def display(){
    println(s"(X=$x , Y=$y)")
  }
  
  def move(dx:Int,dy:Int){
    x = x + dx
    y = y + dy
  }
  
  def getDistanceFrom(p2 : Point):Double={
    
    val xl=x - p2.x
    val yl=this.y - p2.y
    
    val l = scala.math.sqrt(xl*xl + yl*yl)
    
    return l
  }
  
  
}

// Inheritance : Child class extends Parent Class
class Location(val xc:Int,val yc:Int, val yz:Int) extends Point(xc,yc)
{
  var z :Int = yz
  
  // Overriding
  override def display(){
    println(s"(X=$x , Y=$y, Z=$z)")
  }
  
  // Overloading
  def move(dx:Int,dy:Int,dz:Int){
    x = x + dx
    y = y + dy
    z = z + dz
  }
  
}

object TestPoint {
  
  def getDistanceX(p1 : Point, p2 : Point):Double={
    
    val xl=p1.x - p2.x
    val yl=p1.y - p2.y
    
    val l = scala.math.sqrt(xl*xl + yl*yl)
    
    return l
  }
  
  
  
  def main(args: Array[String]): Unit = {
    
    val p1 = new Point(5,10)
    //val p2 = new Point(15,20)
    p1.display()
    //p2.display()
   
    
    p1.move(5, 5)
    p1.display()
    
    //===========================
    val l1 = new Location(5,10,15)
    
    l1.display()
    l1.move(4, 6,5)
    l1.display()
    
    
    //=====================
    
    val q1 = new Point(10,5)
    val q2 = new Point(5,10)
    
    
    //val l = getDistanceX(q1, q2)
    val l = q1.getDistanceFrom(q2)
    
    println("Distance = "+l)
    
    
    

    
    
    
    
    
  }
}