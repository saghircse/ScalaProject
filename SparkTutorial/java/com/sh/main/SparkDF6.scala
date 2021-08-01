package com.sh.main

import org.apache.spark.sql.SparkSession

import org.apache.spark.sql.functions.{lit,col,concat}
import org.apache.spark.sql.functions._



object SparkDF6 {
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


		
		val stdPath = "E:\\CODE\\SPARK\\sparkdemo\\files\\input\\student"
		val stdDF=spark.read
		                .option("header",true)
		                .option("inferSchema", true)
		                .option("delimiter","|") // default delimiter is ,
		                .csv(stdPath)

		
		stdDF.printSchema()
		stdDF.show(false)
		
		val stdDFx = stdDF.withColumn("skills", split(col("skills"),","))
		stdDFx.printSchema()
		stdDFx.show(false)
		
		// explode() : It converts array or map colums to rows
		val stdDFy =  stdDFx.select(col("name"), explode(col("skills")).as("skill")).where("skill is not null or skill !=''")
		stdDFy.printSchema()
		stdDFy.show()
		
		//val outPath = "E:\\CODE\\SPARK\\sparkdemo\\files\\input\\output"
		//stdDFx.coalesce(1).write.json(outPath)
		
		stdDFy.groupBy("skill").agg(
		    collect_set("name").as("persons"),
		    count("name").as("count")
		    ).show(false)
		    
	  stdDFy.groupBy("name").agg(
		    collect_set("skill").as("skills"),
		    count("skill").as("count")
		    ).show(false)
		
		
		
		
		
		
		
		
		
		
  }
}