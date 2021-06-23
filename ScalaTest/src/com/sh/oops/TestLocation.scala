package com.sh.oops

//class Point(xc : Int, yc:Int){
class Point(val xc : Int, val yc:Int){
  var x:Int = xc
  var y:Int = yc
  
  def display(){
    println(s"[x=$x, y=$y]")
  }
  
  def move(dx : Int, dy : Int){
    x = x + dx
    y = y + dy
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
    
    
  }
}