

object TestA {
  def main(args: Array[String]): Unit = {
    val a = Array(100,4,200,1,3,2,11,12,13,14,15,16)
    
    val as = a.toList.sortWith(_<_)
    
    //as.foreach(println)
    
    var mlen=0
    var max=0
    for(i <- 0 to as.length-2){
      
      if(as(i+1)-as(i)==1){
        mlen=mlen+1
      }else{
        if(max<mlen){
          max=mlen
          mlen=0
        }
        
      }
      
    }
    
    max=max+1
    
    println(max)
    
  }
}