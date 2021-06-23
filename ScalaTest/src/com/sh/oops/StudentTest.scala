package com.sh.oops


class Student(){
  
  // State - represented by attributes
  var name=""
  var roll=0
  var mark=0
  
  Int
  
  // Behaviour - represented by methods
  def display():Unit={
    println("Name="+name+" | Roll="+this.roll+" | Marks="+this.mark)
  }
  
}

class StudentX(var name:String,var roll:Int,var mark:Int){
  
  // States - represented by attributes
  //var name:String=name
  //var roll:Int=0
  //var mark=0
  def display():Unit={
    println("Name="+name+" | Roll="+this.roll+" | Marks="+this.mark)
  }
  
  
}


object StudentTest {
  def main(args: Array[String]): Unit = {
    
    val s1 = new Student()
    s1.name="Bern"
    s1.roll=1
    s1.mark=70
    //println("Name="+s1.name+" | Roll="+s1.roll+" | Marks="+s1.mark)
    s1.display()
    
    
    val s2 = new Student
    s2.name="Salman"
    s2.roll=2
    s2.mark=75
    //println("Name="+s2.name+" | Roll="+s2.roll+" | Marks"+s2.mark)
    s2.display()
    
    val s3 = new StudentX("San",3,60)
    //println("Name="+s3.name+" | Roll="+s3.roll+" | Marks"+s3.mark)
    s3.display()
    
    
    
  }
}