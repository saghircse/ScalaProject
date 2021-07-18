package com.sh.main

import org.apache.spark.sql.SparkSession
/**
 * How to create RDD?
 * 	1. Using any Scala collection (List, Set, Map, Seq)
 * 	2. By reading files from HDFS, local FS,etc
 */

object SparkRDD2 {
  def main(args: Array[String]): Unit = {
    
    // Creating Spark Session
     val spark = SparkSession
	    .builder()
			.appName("Spark Tutorial")
			.master("local")
			//.config("spark.some.config.option", "some-value")
			.getOrCreate()
					
		val sc=spark.sparkContext
		sc.setLogLevel("ERROR")

		// Way-2.  By reading files from HDFS, local FS,etc
		val filePath = "E:\\CODE\\SPARK\\SparkTutorial\\files\\input\\file1.txt"
		
		val fileRDD = sc.textFile(filePath).repartition(6)
		println("No of partition in fileRDD = "+fileRDD.getNumPartitions)
		fileRDD.foreach(println)
		
		
		// Writting RDD as text file
		val outPath = "E:\\CODE\\SPARK\\SparkTutorial\\files\\output"
		//fileRDD.repartition(1).saveAsTextFile(outPath)
		//fileRDD.coalesce(1).saveAsTextFile(outPath)
		fileRDD.saveAsTextFile(outPath)

		
		
		
    //val x = scala.io.StdIn.readLine()
  }
}