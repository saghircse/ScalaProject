package com.sh.main

import org.apache.spark.sql.SparkSession
/**
 * How to create RDD?
 * 	1. Using any Scala collection (List, Set, Map, Seq)
 * 	2. By reading files from HDFS, local FS,etc
 */

object SparkRDD4 {
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
		//val filePath = "E:\\CODE\\SPARK\\SparkTutorial\\files\\input\\file1.txt,E:\\CODE\\SPARK\\SparkTutorial\\files\\input\\file2.txt"
		//val filePath = "E:\\CODE\\SPARK\\SparkTutorial\\files\\input"
		val filePath = "E:\\CODE\\SPARK\\SparkTutorial\\files\\input\\file*"
		
		val fileRDD = sc.wholeTextFiles(filePath)
		println("No of partition in fileRDD = "+fileRDD.getNumPartitions)
		fileRDD.foreach(println)
		
		//fileRDD.foreach{ l =>
    //   println(l._1 + "====>" + l._2)
    // }


		
		
		
    //val x = scala.io.StdIn.readLine()
  }
}