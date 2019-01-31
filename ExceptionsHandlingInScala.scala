package String_Exception


/* All Scala Exceptions are unchecked. This is unlike Java, where exceptions are either checked
 *  or unchecked. Here, even SQLException and IOException are unchecked. 
 */
object ExceptionsHandlingInScala extends App {

  def func(n: Int) {
    try {
      print(1 / n)
      var arr = Array(1, 4)
      arr(17)
    } catch {
      case e: ArithmeticException => println(e)

      //Throwable is a super class in the exception hierarchy. So, if we want our
      //code to be able to handle any kind of exception, we use Throwable.

      case anon: Throwable => println("Unknown exception: " + anon)
    } finally {
      //We can release all resources in this block.

      println("This will print no matter what")
    }
  }

  func(0)
  func(1)

}