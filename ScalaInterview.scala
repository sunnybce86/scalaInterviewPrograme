import sun.applet.Main

object ScalaInterview {

  def main(args: Array[String]): Unit = {
    /*
   * This ‘???’ three question marks is not an operator, a method in Scala. It is used to mark a method which is
   * ‘In Progress’ that means Developer should provide implementation for that one
   */

    def add(a: Int, b: Int): Int = ???
    // cross check
    // add(10, 20)

  }

  // Exception in thread "main" scala.NotImplementedError: an implementation is missing

  /*
   * So you can see that in the call-by-value version, the side-effect of the passed-in function call (something()) only happened once. However, in the call-by-name version, the side-effect happened twice.

This is because call-by-value functions compute the passed-in expression's value before calling the function, 
thus the same value is accessed every time.
 However, call-by-name functions recompute the passed-in expression's value every time it is accessed.
   */
  
  def something() = {
  println("calling something")
  1 // return value
}
  //  Call-by-value:
  def callByValue(x: Int) = {
    println("x1=" + x)
    println("x2=" + x)
  }
  callByValue(something())
  //Call-by-name:

  def callByName(x: => Int) = {
    println("x1=" + x)
    println("x2=" + x)
  }
callByName(something())
}