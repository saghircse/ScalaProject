package com.sh.oops

class PointY(val xc : Int, val yc:Int){
  
  // States : variables
  var x:Int = xc //public
  private var y:Int = yc // private : within class/object only
  
  protected var ky = y; // protected : within class/object only + child can access
  
  
  // Behavior : methods
  def display(){
    println(s"[x=$x, y=$y]")
  }
  
  def move(dx : Int, dy : Int){
    x = x + dx
    y = y + dy
  }
  
}


class LocationY( override val xc : Int, override val yc:Int, val zc:Int) extends PointY(xc,yc){
  //var x:Int = xc
  //var y:Int = yc
  var z:Int = zc
  
  
  // Overriding : If parent and child has method with same signature i.e same name and same arguments
  override def display(){
    //println(s"[x=$x, y=$y, z=$z]")  // y is private - can not accessed from outside
    println(s"[x=$x, y=$ky, z=$z]")  // ky is protected - can be accesed from only from child class 
  }
  
  

}


object AccessModifierDemo {
  def main(args: Array[String]): Unit = {
    
    val p1 = new PointY(10,5)
    
    p1.x // By default members are public
    //p1.y // Private members can not be accessed from outside their class / object
    
    //p1.ky // ky is protected - can be accesed from only from child class 
    
    
    
  }
}