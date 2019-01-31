
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global


/// you can make use of flatMap() method to chain multiple futures


object ChainFuturesUsingFlatMap {

  println("Step 1: Define a method which returns a Future")
  def donutStock(donut: String): Future[Int] = Future {
    // assume some long running database operation
    println("checking donut stock")
    10
  }

  println("\nStep 2: Define another method which returns a Future")
  def buyDonuts(quantity: Int): Future[Boolean] = Future {
    println(s"buying $quantity donuts")
    true
  }

  def main(args: Array[String]): Unit = {

    println("\nStep 3: Chaining Futures using flatMap")
    val buyingDonuts: Future[Boolean] = donutStock("plain donut").flatMap(qty => buyDonuts(qty))
    import scala.concurrent.Await
    import scala.concurrent.duration._
    val isSuccess = Await.result(buyingDonuts, 5 seconds)

  }

}