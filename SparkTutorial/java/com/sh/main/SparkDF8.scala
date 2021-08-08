package com.sh.main

import org.apache.spark.sql.SparkSession

import org.apache.spark.sql.functions.{lit,col,concat}
import org.apache.spark.sql.functions._
import org.apache.spark.sql._
import org.apache.spark.sql.types._



object SparkDF8 {
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


		
		val fruitData = Seq(("Banana",1000,"USA"    ),
        ("Carrot",1500,"USA"    ),
        ("Apple",1200,"USA"     ),
        ("Orange",2000,"USA"    ),
        ("Orange",2000,"USA"    ),
("Banana",400,"India"   ),
("Carrot",1200,"India"  ),
("Apple",1200,"India"   ),
("Orange",4000,"India"  ),
("Banana",400,"Canada"  ),
("Apple",1200,"Canada"  ),
("Orange",4000,"Canada" ))

    val fruitDF = fruitData.toDF("Fruit","Amount","Country").cache()
    fruitDF.show()
                      
    
    fruitDF.groupBy("Fruit").sum("Amount").show()
    fruitDF.groupBy("Fruit").pivot("Country").sum("Amount").show()

		
  }
}