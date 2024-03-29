package com.sh.main

import org.apache.spark.sql.SparkSession
/**
 * How to create RDD?
 * 	1. Using any Scala collection (List, Set, Map, Seq)
 * 	2. By reading files from HDFS, local FS,etc
 */

object SparkRDD3WordCount {
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
		val filePath = "E:\\CODE\\SPARK\\SparkTutorial\\files\\input"
		val lineRDD = sc.textFile(filePath)
		
		//val arrRDD=lineRDD.map(l => l.split(" "))
		//arrRDD.foreach(x=>println(x.toList))
		
		val wordRDD=lineRDD.flatMap(l => l.split(" ")).filter(w => w.length() >2)
		//wordRDD.foreach(println)
		
		val tupleRDD = wordRDD.map(w => (w,1) )
		//tupleRDD.foreach(println)
		
		//val wordCountRDD=tupleRDD.reduceByKey(_+_)
		val wordCountRDD=tupleRDD.reduceByKey((x,y)=>x+y) // wide transformation
		wordCountRDD.foreach(println)
		



		
    //val x = scala.io.StdIn.readLine()
  }
}