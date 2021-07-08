package com.sh.main

import org.apache.spark.sql.SparkSession

object SparkDemo {
  def main(args: Array[String]): Unit = {
     val spark = SparkSession
	    .builder()
			.appName("Spark Example")
			.master("local")
			//.config("spark.some.config.option", "some-value")
			.getOrCreate()
					
		
		val sc=spark.sparkContext
		sc.setLogLevel("ERROR")
		val sqlContext = spark.sqlContext
		
		import spark.implicits._
		
		// Word Count Example using Dataset
    val linesDS = sc.parallelize(Seq("Spark is fast", "Spark has Dataset", "Spark Dataset is typesafe")).toDS()
    linesDS.show()
    
    //val x = scala.io.StdIn.readLine()
  }
}