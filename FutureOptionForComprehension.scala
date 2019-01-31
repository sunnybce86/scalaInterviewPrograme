
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
object FutureOptionForComprehension {
  println("Step 1: Define a method which returns a Future Option")

  def donutStock(donut: String): Future[Option[Int]] = Future {
    // assume some long running database operation
    println("checking donut stock")
    if (donut == "vanilla donut") Some(10) else None
  }

  println("\nStep 2: Define another method which returns a Future")

  def buyDonuts(quantity: Int): Future[Boolean] = Future {
    println(s"buying $quantity donuts")
    if (quantity > 0) true else false
  }

  def main(args: Array[String]): Unit = {
    println("\nStep 3: Chaining Future Option using for comprehension")
    for {
      someStock <- donutStock("vanilla donut")
      isSuccess <- buyDonuts(someStock.getOrElse(0))
    } yield println(s"Buying vanilla donut was successful = $isSuccess")
    
    Thread.sleep(3000)
  }
}