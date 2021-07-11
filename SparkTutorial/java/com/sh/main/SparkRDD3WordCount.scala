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
		
		//val listRDD=lineRDD.map(x => x.split(" ").toList)
		//listRDD.foreach(println)
		
		// Create RDD of words from RDD of lines (filter words having length greater than 2)
		val wordRDD = lineRDD.flatMap(x=>x.split(" ")).filter(x=> x.length()>2)
		
		// Create RDD of Tuple(word,1)
		val wordTupleRDD = wordRDD.map(x=> (x,1))
		//wordTupleRDD.foreach(println)
		
		
		val wordCountRDD=wordTupleRDD.reduceByKey((a,b) =>a+b)
		wordCountRDD.foreach(println)


		
    //val x = scala.io.StdIn.readLine()
  }
}