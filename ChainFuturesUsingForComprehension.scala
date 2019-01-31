import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object ChainFuturesUsingForComprehension {

  def getUser(userName: String): Future[Int] = Future {
    // assume some long running database operation
    println("checking User Salary")
    1000

  }

  def getSalary(salary: Int): Future[Boolean] = Future {

    println(s"buying $salary donuts")
    true
  }

  def main(args: Array[String]): Unit = {
    println("\nStep 3: Chaining Futures using for comprehension")
    for 
    {
     sal <- getUser("Sunny")
     
     isSuccess <-getSalary(sal)
    } yield println(s"User Salary = $isSuccess")
    
    Thread.sleep(1000)
    
  }
}