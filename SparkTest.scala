package com.sh

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.Row
import org.apache.spark.sql.types.StructType
import org.apache.spark.sql.types.StructField
import org.apache.spark.sql.types.StringType
import org.apache.spark.sql.types.DoubleType
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types.FloatType

object SparkTest {
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

		// define UDAF
		val customMean = new CustomMean()

val rows = sc.parallelize(List(
      Row.fromSeq(List(1.0f, 1.0f, 8.0f, 99.0f)),
      Row.fromSeq(List(1.0f, 1.0f, 10.0f, 98.0f)),
      Row.fromSeq(List(1.0f, 2.0f, 11.0f, 97.0f)),
      Row.fromSeq(List(1.0f, 2.0f, 14.0f, 96.0f)),
      Row.fromSeq(List(2.0f, 1.0f, 20.0f, 95.0f)),
      Row.fromSeq(List(2.0f, 1.0f, 22.0f, 94.0f)),
      Row.fromSeq(List(2.0f, 2.0f, 21.0f, 93.0f)),
      Row.fromSeq(List(2.0f, 2.0f, 24.0f, 92.0f))
    ))
    val schema_cols = List(
      StructField("ti1", FloatType, true),
      StructField("ti2", FloatType, true),
      StructField("ti3", FloatType, true),
      StructField("ti4", FloatType, true)
    )

    val schema = StructType(schema_cols)

   
    val df = sqlContext.createDataFrame(rows, schema)
    df.createOrReplaceTempView("temp")
    //df.registerTempTable("temp")					
		println("===============>INPUT DATAFRAME");
		df.show()
		
		
		// UDF - Multiply by X
		def multiplyX(n:Double,x:Int) : Double = {
		 val y= n*x
		 y
		}
		
		sqlContext.udf.register("multiplyX",multiplyX(_,_))
		
		val df3 =  sqlContext.sql("select ti1,ti2,ti3,ti4,multiplyX(ti3,2) as double_ti3 from temp")
		df3.show()
		
		// UDAF
		
		
		
		//==============================================
		System.exit(1)

		//================================== UDAF Example - Mean ===============================
		// Calculate average value for each group
		// Way-1 : Using DQL
		val df1=df.groupBy("key").agg( customMean(df.col("value")).as("custom_mean"), avg("value").as("avg"))
		println("===============>OUTPUT DATAFRAME : Mean UDAF Way-1");
		df1.show()
		
		// Way-2 : Using Spark SQL
		df.createOrReplaceTempView("dft")
		sqlContext.udf.register("customMean",customMean)
		val df2 =  sqlContext.sql("select key,customMean(value) as custom_mean, avg(value) as avg from dft group by key")
		println("===============>OUTPUT DATAFRAME : Mean UDAF Way-2");
		df2.show()
		
		
		//================================== UDF Example - Multiply ===============================
		

	}
}