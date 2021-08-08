package com.sh.main

import org.apache.spark.sql.SparkSession

import org.apache.spark.sql.functions.{lit,col,concat}
import org.apache.spark.sql.functions._
import org.apache.spark.sql._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions.Window



object SparkDF9 {
  def main(args: Array[String]): Unit = {
    
    // Creating Spark Session
     val spark = SparkSession
	    .builder()
			.appName("Spark Tutorial")
			.master("local")
			//.config("spark.some.config.option", "some-value")
			.getOrCreate()
					
		val sc=spark.sparkContext
		//val sqlContext = spark.sqlContext
		sc.setLogLevel("ERROR")
		import spark.implicits._

		
		val filePath = "E:\\CODE\\SPARK\\SparkTutorial\\files\\input\\emp_json"
		//val lineRDD = sc.textFile(filePath)
		val empDF=spark.read
		                .json(filePath)
		                .cache()
		                
		//val empDFx = empDF.withColumn("salary", col("salary").cast("Integer"))
		                  //.withColumn("bonus", col("bonus").cast("Integer"))
		                
		empDF.show()

		val windowSpec = Window
		
		val empWindow1 = Window.orderBy("sal")
		val empWindow2 =Window.partitionBy("dept").orderBy("sal")

val empDFx =  empDF.withColumn("row_number", row_number.over(empWindow1) )
.withColumn("rank", rank.over(empWindow1) )
.withColumn("dense_rank", dense_rank.over(empWindow1) )

empDFx.show()

val empDFy =  empDF.withColumn("row_number", row_number.over(empWindow2) )
.withColumn("rank", rank.over(empWindow2) )
.withColumn("dense_rank", dense_rank.over(empWindow2) )

empDFy.show()


		
  }
}