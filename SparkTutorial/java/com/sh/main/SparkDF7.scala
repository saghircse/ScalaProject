package com.sh.main

import org.apache.spark.sql.SparkSession

import org.apache.spark.sql.functions.{lit,col,concat}
import org.apache.spark.sql.functions._
import org.apache.spark.sql._
import org.apache.spark.sql.types._



object SparkDF7 {
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


		
		val empData = Seq(Row("James","Smith",1,"M",3000),
                      Row("Maria","John",2,"F",8000),
                      Row("Raj","Singh",5,"M",6000),
                      Row("Bern","Henry",7,"M",9000))
                      
    val empDatax = Seq(Row(Row("James","Smith"),1,"M",3000),
                      Row(Row("Maria","John"),2,"F",8000),
                      Row(Row("Raj","Singh"),5,"M",6000),
                      Row(Row("Bern","Henry"),7,"M",9000))
                      
    val empSchema = StructType(Array(
        StructField("fname",StringType,true),
        StructField("lname",StringType,true),
        StructField("id",IntegerType,true),
        StructField("gender",StringType,true),
        StructField("salary",IntegerType,true)
        )
        )
        
    val empSchemax = new StructType()
     .add("full_name",new StructType().add("fname", StringType).add("lname", StringType))
     .add("id", IntegerType)
     .add("gender",StringType)
     .add("salary",IntegerType)
        
    val empRDD = sc.parallelize(empData)
     val empDF = spark.createDataFrame(empRDD, empSchema)
     
     empDF.printSchema()
     empDF.show()
     
   val empRDDx = sc.parallelize(empDatax)
     val empDFx = spark.createDataFrame(empRDDx, empSchemax)
     
     empDFx.printSchema()
     empDFx.show()
		
  }
}