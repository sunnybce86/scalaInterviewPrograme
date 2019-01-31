
import scala.util.{ Failure, Success, Try }
object FutureTraverse {
  /* the traverse function also allows you to fire a bunch of future operations in parallel and wait for their results
   *
   */

  println("Step 1: Define a method which returns a Future Option")

  import scala.concurrent.Future
  import scala.concurrent.ExecutionContext.Implicits.global

  def donutStock(donut: String): Future[Option[Int]] = Future {
    println("checking donut stock")
    if (donut == "vanilla donut") Some(10) else None
  }

  println(s"\nStep 2: Create a immutable List of future operations")

  val futureOperations = List(
    donutStock("vanilla donut"),
    donutStock("plain donut"),
    donutStock("chocolate donut"))
 
    println(s"\nStep 3: Call Future.traverse to convert all Option of Int into Int")
    val futureTraverseResult = Future.traverse(futureOperations) { futureSomeQty =>
      futureSomeQty.map(someQty => someQty.getOrElse(0))
    }
    futureTraverseResult.onComplete {
      case Success(results) => println(s"Results $results")
      case Failure(e) => println(s"Error processing future operations, error = ${e.getMessage}")
    }
   
}