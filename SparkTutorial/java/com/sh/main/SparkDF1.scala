package com.sh.main

import org.apache.spark.sql.SparkSession

object SparkDF1 {
  def main(args: Array[String]): Unit = {
    
    // Creating Spark Session
     val spark = SparkSession
	    .builder()
			.appName("Spark Tutorial")
			.master("local")
			.getOrCreate()
					
		val sc=spark.sparkContext
		//val sqlContext = spark.sqlContext
		sc.setLogLevel("ERROR")
		import spark.implicits._


		// Way-1 : Collection -> RDD -> Dataframe
		val nums = List(1,2,3,4,5,6,7,8,9)
		val numsRDD= sc.parallelize(nums,3) 
		val numsDF = numsRDD.toDF("id")
		numsDF.show(10)
		
		val empList = List(("Raj","IT", 30000 ),("Ram","IT",50000),
                  ("San","IT", 60000 ),("Fan","Bank", 60000 ),("Jan","Bank", 50000 ))
    val empRDD = sc.parallelize(empList)
    val empDF=empRDD.toDF("name","dept","salary")
    
    empDF.show()
		
		
		
	
		
  }
}