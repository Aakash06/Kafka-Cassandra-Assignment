
import scala.concurrent.ExecutionContext.Implicits.global
import twitter4j._
import scala.collection.JavaConverters._
import scala.concurrent.Future

class TwitterFetcher {

  val twitter: Twitter = TwitterFactory.getSingleton

  def searchUsingHashtags(username:String): Future[List[String]] = Future {

    twitter.getUserTimeline(username).asScala.toList.flatMap{
      tweets=>tweets.getHashtagEntities.toList.map(_.getText)
    }
  }

}