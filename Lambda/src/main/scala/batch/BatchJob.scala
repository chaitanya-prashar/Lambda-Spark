package batch

import java.lang.management.ManagementFactory
import org.apache.spark.{SparkContext, SparkConf}

/**
  * Created by chaitanyaprashar on 03/02/2017.
  */
object BatchJob extends App {

    val conf = new SparkConf()
        .setAppName("Lambda with Spark").setMaster("local[*]")

    // setup spark context
    val sc = new  SparkContext(conf)

    val sourceFile = "/Users/chaitanyaprashar/Spark-Kafka/spark-kafka-cassandra-applying-lambda-architecture/vagrant/data.tsv"
    val input = sc.textFile(sourceFile)

    input.foreach(println)


}
