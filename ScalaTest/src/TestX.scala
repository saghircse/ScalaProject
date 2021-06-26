
import scala.util.control._

object TestX {
  def main(args: Array[String]): Unit = {
    
    var ar=Array(
        Array(5, 8, 10),
        Array(13, 19, 22),
        Array(45, 78, 79),
        Array(80, 101, 200)
        )
    
   val x = 20 
        
   var sr,sc=0
   var er,rows=ar.length
   var ec,cols= ar(0).length
   
   var midr,midc=0
   
   var flag=false
   
   val brk_loop= new Breaks
   brk_loop.breakable{
   while(sr<=er && sc<=ec)// && sr<rows && er<rows && sc < cols && ec < cols)
   {
     
     midr = (sr+er)/2
     midc = (sc+ec)/2
     
     if(ar(midr)(midc)==x){
       //Found - Break
       flag=true
       brk_loop.break()
     }
     else if(x<ar(midr)(midc)){
       //er=
       if(ec-1>= 0){
         ec=ec-1
       }else{
         ec=cols-1
         er=er-1
       }
       
     }else{
       if(sc+1<=cols){
         sc=sc+1
       }else{
         sc=0
         sr=sr+1
       }
       
     }
     
   }//while
   }// loop break
   
   if(flag){
     println(s"$x Found")
   }else{
     println(s" $x Not Found")
   }
   
    
  }
}