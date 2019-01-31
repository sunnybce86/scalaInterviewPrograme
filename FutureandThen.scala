

object FutureandThen {

  println("Step 1: Define a method which returns a Future")
  import scala.concurrent.Future
  import scala.concurrent.ExecutionContext.Implicits.global

  def donutStock(donut: String): Future[Int] = Future {
    // assume some long running database operation
    println("checking donut stock")
    10
  }

  def main(args: Array[String]): Unit = {

    println(s"\nStep 2: Call Future.andThen with a PartialFunction")
    val donutStockOperation = donutStock("vanilla donut")
    donutStockOperation.andThen{ case stockQty => println(s"Donut stock qty = $stockQty")}
    Thread.sleep(1000)
  }
}