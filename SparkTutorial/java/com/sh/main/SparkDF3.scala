package com.sh.main

import org.apache.spark.sql.SparkSession

import org.apache.spark.sql.functions.{lit,col,concat}
//import org.apache.spark.sql.functions.col



object SparkDF3 {
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


		
		val filePath = "E:\\CODE\\SPARK\\sparkdemo\\files\\input\\emp_with_header"
		val empDF=spark.read
		                .option("header",true)
		                .option("delimiter","|") // default delimiter is ,
		                .csv(filePath)
		empDF.show
		
		// Add a new columns or update or rename existing column
		// 1. Adding new column with constant value using lit() -- company
		// 2. Adding new column by deriving value from existing columns  -- full_name
		// 3. Updating value of existing columns  -- salary
		// 4. Change data type of existing column -- salary
		// 4. Renaming existing column -- dept
		val empDFx = empDF.withColumn("company", lit("IBM")) 
		                  .withColumn("full_name", concat(col("first_name"),lit(" "),col("last_name")))
		                  .withColumn("salary", col("salary")+1000) // updating existing column
		                  .withColumn("salary_int", col("salary").cast("Integer"))
		                  .withColumnRenamed("dept", "department")
		                  .drop("last_name")
		                  
		empDFx.show()
		
		
		
		// Add, Repace or update multiple columns
		// Step:1 - Create temporary view
		// Step:2 - Use sql queries
		//empDF.createOrReplaceGlobalTempView("empView")
		empDF.registerTempTable("empView")
		
		val empQuery = """select 
		  concat(first_name,' ', last_name) as full_name,
		  salary+1000 as slary,
		  dept as department,
		  'IBM' as company,
		  address
		  from empView
		  """
		
		//val empDFy = spark.sql("select * from empView")
		val empDFy = spark.sql(empQuery)
		empDFy.show()
		
		
		
		
    //val x = scala.io.StdIn.readLine()
  }
}