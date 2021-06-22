package com.sh.oops

class Employee(){ //Primary Constructor
  println("Default Constructor")
  
  // Object/ Instance variables
  var id = 0
  var name = ""
  var age:Int=0
  
  
  def this(idx : Int, name : String,eage:Int){ // Secondary 
    this() // Calling Primary Constructor
    age=eage
    this.name=name
    this.id=idx
  }
  
   def this(id : Int, name : String){ // Secondary 
    this() // Calling Primary Constructor
    this.name=name
    this.id=id
  }
   
  def display(){
    
    println(id +" | "+this.name+" | "+this.age)
  }
  
  def equals(emp : Employee ) : Boolean ={
    
    var flag=false
    if(this.id == emp.id && this.name==emp.name && this.age==emp.age){
      flag=true
    }
    
    return flag
  }
  
  
  def toStringX() : String={  
    return "[Id="+this.id +" | name="+this.name+" | age="+this.age+"]"
  }
  
  
  
}





object TestEmployee {
    def main(args: Array[String]): Unit = {
      val e0=new Employee()
      e0.display()
      
      val e1 = new Employee(2,"Raj")
      e1.age=40
      e1.display()
      
      
      val e2 = new Employee(2,"Raj",40)
      e2.display()
      val e3 = new Employee(2,"Raj",50)
      e2.display()
      
      
      // String comparison
      val s1 = "San"
      val s2 = "San"
      println(s1.equals(s2))
      
      // Object comparision
      println(e3.equals(e2))
      println(e2.toStringX())
      println(e3.toStringX())
 
      
      
       var ar = Array(2,4,5) 
       
       var empArray = Array(e1,e2,e3)
       
     
       
      
    }
}