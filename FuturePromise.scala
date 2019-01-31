import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{ Future, Promise }
import scala.util.Success
import scala.util.{ Failure, Success, Try }

object FuturePromise {
  /*
   * Future promise
		So far we've been using future's return type to mark our methods to run asynchronously.
		 Scala provides an abstraction over future and it is called a Promise.
   */

  println("Step 1: Define a method which returns a Future")
  import scala.concurrent.ExecutionContext.Implicits.global
  import scala.concurrent.Future
  import scala.concurrent.ExecutionContext.Implicits.global

  def donutStock(donut: String): Int = {
    if (donut == "vanilla donut") 10
    else throw new IllegalStateException("Out of stock")
  }

  println(s"\nStep 2: Define a Promise of type Int")

  val donutStockPromise = Promise[Int]()

  println("\nStep 3: Define a future from Promise")

  val donutStockFuture = donutStockPromise.future

  
  donutStockFuture.onComplete {
    case Success(stock) => println(s"Stock for vanilla donut = $stock")
    case Failure(e) => println(s"Failed to find vanilla donut stock, exception = $e")
  }

  def main(args: Array[String]): Unit = {
    println("\nStep 4: Use Promise.success or Promise.failure to control execution of your future")
    
    val donut = "vanilla donut"
    if (donut == "vanilla donut") {
      donutStockPromise.success(donutStock(donut))
    } else {
      donutStockPromise.failure(Try(donutStock(donut)).failed.get)
    }
  }

}