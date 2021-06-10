package com.sh.oops

object TestEmp {
  def main(args: Array[String]): Unit = {
    
    
    val e1 = new Employee(1,"Raj",50000)
    println(e1.getName()+"-> Salary = "+e1.getSalary())
    
    val e2 = new Employee(2,"Ram",30000)
    
    e2.setSalary(40000)
    println(e2.getName()+"-> Salary = "+e2.getSalary())
    

    

    
    
    
  }
  
  
}