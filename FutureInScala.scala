
import scala.concurrent.Future
import scala.concurrent.Await
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.util.Success
import scala.util.{Failure, Success}

object FutureInScala {
  println("Step 1: Define a method which returns a Future with  blocking future result")
  def getUser(): Future[String] = Future {
    // assume some long running database operation

    println("Checking for User")

    "Raman Singh with blocking future"

  }

  println("Step 1: Define a method which returns a Future  with Non blocking future result")

  def getUser1(): Future[String] = Future {

    println("Non blocking future call")

    "Raman Singh with non blocking future"
  }

  
  println("Step 1: Chain futures using flatMap")
  
  
  def main(args: Array[String]): Unit = {
   
    println("\nStep 2: Call method which returns a Future")

    // In general, avoid blockin
    val userDetail = Await.result(getUser(), 10 seconds)
    println(s"User Detail= $userDetail")
    
    getUser1().onComplete{
      
      case Success(user)=> println(s"$user")
      case Failure(error) => println(s"Failed to find user, exception = $error")
      
    }
    Thread.sleep(3000)
     
    
  }

}