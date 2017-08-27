import com.datastax.driver.core.Session
import org.slf4j.{Logger, LoggerFactory}

import scala.collection.JavaConverters._

object CassandraCrud extends CassandraProvider {
  private val log: Logger = LoggerFactory.getLogger(this.getClass())

  // Connect to the cluster and keyspace "devjavasource"

  log.info("*********Cluster Information *************")
  log.info(" Cluster Name is: " + cassandraConn.getCluster.getClusterName)
  log.info(" Cluster Configuration is: " + cassandraConn.getCluster.getConfiguration)
  log.info(" Cluster Metadata is: " + cassandraConn.getCluster.getMetadata)
  log.info(" Cluster Metrics is: " + cassandraConn.getCluster.getMetrics)

  // Close Cluster and Session objects
  log.info("Is Session Closed :" + cassandraConn.isClosed)
 // cassandraConn.close()
  log.info("Is Session Closed :" + cassandraConn.isClosed)

  def insertHashTags(hashTag:String): Unit = {
    cassandraConn.execute(s"CREATE TABLE IF NOT EXISTS hashTags (hashTag text PRIMARY KEY) ")

    // Use select to get the users table data
    val results = cassandraConn.execute(s"INSERT INTO hashTags (hashTag) VALUES ('$hashTag')").asScala.toList
    for(row <- results)
      {
        log.info("data: -"+row)
      }
    }

}
