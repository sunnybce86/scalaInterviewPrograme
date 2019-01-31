package String_Exception

object ThrowInScala {
  /*We can also explicitly throw a Scala exception in our code. We use the Throw Keyword for this. Let’s create a
   *  custom exception.In Jewish culture, Bat Mitzvah is coming with age ceremony with age 12 for young boys.
   */

  def batmitzvah(age: Int) {
    if (age < 18) {
      throw new Exception("'---Sorry, you're ineligible disco club----'")
     // throw new Throwable("'---Sorry, you're ineligible disco club----'")
    } else { println("Eligible") }
  }
  
  def main(args:Array[String]):Unit=
  {
    batmitzvah(20)
    batmitzvah(10)
  }
  
}