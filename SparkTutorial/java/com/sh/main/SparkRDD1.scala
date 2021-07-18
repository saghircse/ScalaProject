package com.sh.main

import org.apache.spark.sql.SparkSession
/**
 * How to create RDD?
 * 	1. Using any Scala collection (List, Set, Map, Seq)
 * 	2. By reading files from HDFS, local FS,etc
 */

object SparkRDD1 {
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
		//import spark.implicits._


		// Way-1. Using any Scala collection (List, Set, Map, Seq)
		val nums = List(1,2,3,4,5,6,7,8,9)
		val numsRDD= sc.parallelize(nums,3) // Parallelize will distribute across nodes
		println("No of partition in numsRDD = "+numsRDD.getNumPartitions)		
		
		val sumRDD=numsRDD.reduce(_+_)
		
		
		
		
		//val linesArray = numsRDD.collect() // collect will collect from all nodes to driver
		
		println("==================>numsRDD")
		//numsRDD.foreach(println) // This will not show output in cluster mode
		//linesArray.foreach(println) // This will show output
		
		
		val squareRDD = numsRDD.map(x => x*x)
		println("==================>squareRDD")
		//squareRDD.foreach(println)
		
		val evenRDD=squareRDD.filter(x => x%2==0)
		println("==================>even squareRDD")
		evenRDD.foreach(println) // Action
		
		//numsRDD.map(x => x*x).filter(x => x%2==0)
		
		
		
    //val x = scala.io.StdIn.readLine()
  }
}