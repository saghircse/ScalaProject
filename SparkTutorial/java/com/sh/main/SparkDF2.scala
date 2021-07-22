package com.sh.main

import org.apache.spark.sql.SparkSession

import org.apache.spark.sql.functions.{lit,col}
//import org.apache.spark.sql.functions.col

object SparkDF2 {
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


		val filePath = "E:\\CODE\\SPARK\\SparkTutorial\\files\\input\\emp"
		//val lineRDD = sc.textFile(filePath)
		val empDF=spark.read.csv(filePath).toDF("name","dept","salary")
		empDF.show(3)
		empDF.show(3,false)
		
		val filePath2 = "E:\\CODE\\SPARK\\SparkTutorial\\files\\input\\emp_with_header"
		//val lineRDD = sc.textFile(filePath)
		val empDF2=spark.read
		                .option("delimiter","|")
		                .option("header",true)
		                .csv(filePath2)
		empDF2.show
		
		// Reading JSON File
		val filePath3 = "E:\\CODE\\SPARK\\SparkTutorial\\files\\input\\emp_json"
		val empDF3 = spark.read.json(filePath3)
		                  .withColumn("company", lit("XYZ"))
		                  //.withColumn("new_sal", col("sal")+10000)
		                  .withColumn("sal", col("sal")+10000)
		                  .withColumnRenamed("dept", "department")
		                  
		empDF3.printSchema()
		
	
		empDF3.show()
		
		
		
		
	
		
  }
}