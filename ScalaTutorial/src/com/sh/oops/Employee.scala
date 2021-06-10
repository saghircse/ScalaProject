package com.sh.oops

class Employee(eId:Int, eName : String, var eSalary:Double) {
  
  def getSalary() : Double={
    return eSalary
  }
  
  def getName() : String={
    return eName
  }
  
  
  def getId() : Int={
    return eId
  }
  
  def setSalary(sal : Double) : Unit={
    eSalary = sal;
  }
  
}