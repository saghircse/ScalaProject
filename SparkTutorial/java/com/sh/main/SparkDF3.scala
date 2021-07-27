package com.sh.main

import org.apache.spark.sql.SparkSession

import org.apache.spark.sql.functions.{lit,col,concat}
import org.apache.spark.sql.functions._

object SparkDF3 {
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


		
		val filePath = "E:\\CODE\\SPARK\\SparkTutorial\\files\\input\\emp_with_header"
		//val lineRDD = sc.textFile(filePath)
		val empDF=spark.read
		                .option("delimiter","|")
		                .option("header",true)
		                .csv(filePath)
		empDF.show()
		
		//1. Adding new column with constant value using lit()
		//2. Adding new column with derived from existing fileds
		//3. Update existing field
		val empDFx = empDF.withColumn("company", lit("XYZ")) // Constant
		                  .withColumn("full_name",concat(col("first_name"),lit(" "),col("last_name")))
		                  .withColumn("salary",col("salary").cast("Integer")+10000)
		                  .withColumnRenamed("dept", "department")
		                  .drop("last_name")
		                  .withColumn("gender_new1", when(col("gender")==="M","Male").when(col("gender")==="F","Female").otherwise("Unknown"))
		                  .withColumn("gender_new2", expr("case when gender='M' then 'Male' when gender='F' then 'Female' else 'Unknown' end"))
		                  //.where(empDF("dept")==="Admin")
		                  .withColumn("address_array", split(col("address"),","))
		                  .withColumn("city", col("address_array")(0))
		                  .withColumn("state", col("address_array")(1))
		                  .withColumn("country", col("address_array")(2))
		                                 
	
		empDFx.show() 
		
		System.exit(0)
		
		val empDF_distinct = empDF.distinct()
		empDF_distinct.show()
		
		val empDF_dedup = empDF.dropDuplicates("first_name","last_name","dept")
		empDF_dedup.show()
		
		
		// Register dataframe as temporary table
		empDF.registerTempTable("empTable")
		
		
		
		val empQuery = """select
		  concat(first_name,' ', last_name) as full_name,
		  salary+10000 as salary,
		  'ABC' as company,
		  dept as department,
		  case when gender='M' then 'Male' when gender='F' then 'Female' else 'Unknown' end as gender
		  from empTable
		  where dept='IT'
		  """
		
		//val empDFy = spark.sql("select * from empTable")
		val empDFy = spark.sql(empQuery)
		
		//empDFy.show()
		
		
	
		
  }
}