package com.sh.main
/**
 * GROUP BY and AGGREGATION
 * 
 */

import org.apache.spark.sql.SparkSession

import org.apache.spark.sql.functions.{lit,col,concat}
import org.apache.spark.sql.functions._

object SparkDF5 {
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


		
		val bookFile = "E:\\CODE\\SPARK\\SparkTutorial\\files\\input\\book"
		val writerFile = "E:\\CODE\\SPARK\\SparkTutorial\\files\\input\\writer"
		
		val bookDF=spark.read
		                .option("delimiter","|")
		                .option("header",true)
		                .option("inferSchema",true)
		                .csv(bookFile)
		                
		                
		val witerDF=spark.read
		                .option("delimiter","|")
		                .option("header",true)
		                .option("inferSchema",true)
		                .csv(writerFile)
		                
		
		 bookDF.show()
		 witerDF.show()
		 
		 println("Inner Join")
		 val innerDF=bookDF.join(witerDF,bookDF("writer_id")===witerDF("id"),"inner")
		 innerDF.show()
		 
		 println("Left Outer Join")
		 val leftDF=bookDF.join(witerDF,bookDF("writer_id")===witerDF("id"),"leftouter")
		 leftDF.show()
		 
		 println("Right outer Join")
		 val rightDF=bookDF.join(witerDF,bookDF("writer_id")===witerDF("id"),"rightouter")
		 rightDF.show()
		 
		 
		 println("Full outer Join")
		 val fullDF=bookDF.join(witerDF,bookDF("writer_id")===witerDF("id"),"fullouter")
		 fullDF.show()
		 
		 println("Cross Join")
		 spark.conf.set("spark.sql.crossJoin.enabled",true)
		 val crossDF=bookDF.join(witerDF)
		 crossDF.show()
		 
		 println("Left Semi Join")
		 val leftSemiDF=bookDF.join(witerDF,bookDF("writer_id")===witerDF("id"),"leftsemi")
		 leftSemiDF.show()
		 
		 println("Left Anti Join")
		 val leftAntiDF=bookDF.join(witerDF,bookDF("writer_id")===witerDF("id"),"leftanti")
		 leftAntiDF.show()
		
		
		
		
		
		
	
		
  }
}