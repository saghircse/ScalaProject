package com.sh.oops


class Employee(var name:String,var age:Int, var position:String){
  val companyName="Apple"
	def display() : Unit={
	  val ageGroup = getAgeGroup()
	  println(s"Name = $name | Age = $age | Postion = $position  |	AgeGroup = $ageGroup")
	}
	
	def getAgeGroup():String={
		var ageGroup=""
		if(age<=18){
			ageGroup="Young"
		}else if(age>18 && age<=50){
			ageGroup="Adult"
		}else{
			ageGroup="Senior Citizen"
		}
		
		ageGroup
	}
	

}

object TestEmployee {
  def main(args: Array[String]): Unit = {
    
    
    var employee1 = new Employee("San", 17, "Chef")
    var employee2 = new Employee("Fan", 65, "HR")
    var employee3 = new Employee("Dan", 25, "Frontdesk")
    
    employee1.name="John"
    
    //println(employee1.age)
    println(employee1.companyName)
    
    
    employee1.display()
    employee2.display()
    employee3.display()
    
    //println(employee1.getAgeGroup())
    //println(employee2.getAgeGroup())
    //println(employee3.getAgeGroup())
    
    
    
    
  }
  
}