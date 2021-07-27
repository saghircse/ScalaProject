package com.sh.main
/**
 * GROUP BY and AGGREGATION
 * 
 */

import org.apache.spark.sql.SparkSession

import org.apache.spark.sql.functions.{lit,col,concat}
import org.apache.spark.sql.functions._

object SparkDF4 {
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


		
		val filePath = "E:\\CODE\\SPARK\\SparkTutorial\\files\\input\\emp_with_header"
		//val lineRDD = sc.textFile(filePath)
		val empDF=spark.read
		                .option("delimiter","|")
		                .option("header",true)
		                .option("inferSchema",true)
		                .csv(filePath)
		                .cache()
		                
		//val empDFx = empDF.withColumn("salary", col("salary").cast("Integer"))
		                  //.withColumn("bonus", col("bonus").cast("Integer"))
		                
		empDF.show()
		empDF.show(50,false)
		
		empDF.printSchema()
		
		
		empDF.groupBy("dept").sum("salary").show()
		//empDF.groupBy("dept").count().show()
		//empDF.groupBy("dept").min("salary").show()
		//empDF.groupBy("dept").max("salary").show()
		empDF.groupBy("dept").avg("salary").show()
	
		
		empDF.groupBy("dept","gender").sum("salary").show()
		//empDF.groupBy("dept","gender").count().show()
		//empDF.groupBy("dept","gender").min("salary").show()
		//empDF.groupBy("dept","gender").max("salary").show()
		empDF.groupBy("dept","gender").avg("salary").show()
		
		
		empDF.groupBy("dept","gender").sum("salary","bonus").show()
		//empDF.groupBy("dept","gender").count().show()
		//empDF.groupBy("dept","gender").min("salary","bonus").show()
		//empDF.groupBy("dept","gender").max("salary","bonus").show()
		empDF.groupBy("dept","gender").avg("salary","bonus").show()
		
		//
		val empDF_agg=empDF.groupBy("dept")
		      .agg(
		          sum("salary").as("total_salary"),
		          min("salary").as("min_salary"),
		          avg("salary").as("avg_salary"),
		          sum("bonus").as("total_bonus"),
		          min("bonus").as("min_bonus"),
		          avg("bonus").as("avg_bonus"),
		          )
		          
	  empDF_agg.show(false)
		
		
		
		
		
	
		
  }
}