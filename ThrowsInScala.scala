package String_Exception

object ThrowsInScala extends App {
  /*When we know that certain code throws an exception in Scala,
 * we can declare that to Scala. This helps the caller function handle
 *  and enclose this code in Try – Catch Blocks to deal with the situation.
 *  We can either use the throws keyword or the throws annotation.
 *
 */

  @throws(classOf[NumberFormatException])
  def validateit() = {
    "abcd".toInt
  }
  validateit()

  def person(age: Int) {
    if (age != 15)
      throw new Exception("Wait a little")
    else println("Enjoy your quinceanera")
  }

}