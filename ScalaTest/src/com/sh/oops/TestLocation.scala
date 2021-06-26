package com.sh.oops

//class Point(xc : Int, yc:Int){
class Point(val xc : Int, val yc:Int){
  
  // States : variables
  var x:Int = xc
  var y:Int = yc
  
  // Behavior : methods
  def display(){
    println(s"[x=$x, y=$y]")
  }
  
  def move(dx : Int, dy : Int){
    x = x + dx
    y = y + dy
  }
  
  def getDistanceFrom(p:Point) : Double={
    
    val xl = x - p.x
    val yl = y - p.y
    
    val d = scala.math.sqrt(xl*xl + yl*yl)
    
    return d
    
  }
  
  
}

class Location( override val xc : Int, override val yc:Int, val zc:Int) extends Point(xc,yc){
  //var x:Int = xc
  //var y:Int = yc
  var z:Int = zc
  
  
  // Overriding : If parent and child has method with same signature i.e same name and same arguments
  override def display(){
    println(s"[x=$x, y=$y, z=$z]")
  }
  
  // Overloading : If two methods with same name but different arguments
  def move(dx : Int, dy : Int, dz:Int){
    x = x + dx
    y = y + dy
    z = z + dz
  }
  

}

object TestLocation {
  
  def getDistance(p1 : Point, p2:Point) : Double={
    
    val xl = p1.x - p2.x
    val yl = p1.y - p2.y
    
    val d = scala.math.sqrt(xl*xl + yl*yl)
    
    return d
    
  }
  
  def concatx(x1:String,x2:String) : String={
    
    return x1+x2
  }
  
  def main(args: Array[String]): Unit = {
    
    val p1 = new Point(10,5) 
    //val p2 = new Point(15,15) 
    p1.display()
    //p2.display()
    p1.move(10, 5)
    p1.display()
    
    val l1 = new Location(5,10,15)
    l1.display()
    //l1.move(5, 5)
    l1.move(5, 5, 5)
    l1.display()
    
    
    val q1 = new Point(10,5) 
    val q2 = new Point(20,15)
    q1.display()
    q2.display()
    
    val d = getDistance(q1, q2) // getgetDistance is not member of Point
    println(s"Distance = $d")
    
    val d2= q1.getDistanceFrom(q2) // getgetDistance is member of Point
    println(s"Distance = $d2")
    
    //========================
    val s1 : String = "Hello"
    val s2 : String = "World"
    
    s1.concat(s2)  // concat is member of String
    
    concatx(s1,s2)  // concatx is not member of String
    
    
    
    
    
    
    
    
    
  }
}