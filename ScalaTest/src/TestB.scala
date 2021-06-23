
 object TestB {
  def main(args: Array[String]): Unit = {
    val a = Array(100,4,200,1,3,2,11,12,13,14,15,16)
    
    
//Input: num = "1432219", k = 3
//Output: 1219
    
 //1
    
//1432219
    
// 1122349
    
    val num = "1432219"
    val k = 3
    
    val numa = num.split("").map(x=>x.toInt)
    val l =numa.size
    
    val temp=Array[Int](k)
    
    for(i <- 0 to l-k-1){
      temp(i)=numa(i)
    }
    
    
    
    //
    
    
    
    
    
    
    
    
   
    
  }
}