object HelloScala {
  def main(args: Array[String]): Unit = {
    
    println("Hello Scala...I am learning Scala");
    println(sum(10,5))
    
  }
  
  def sum(a:Int,b:Int): Int = {
    
    val s = a+b;
    return s;
  }
}
