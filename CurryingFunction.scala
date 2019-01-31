package ScalaFuntion_Inheritance_Overload_Override

object CurryingFunction {
  //If a Scala function takes multiple parameters, we can transform it into a chain of functions where each takes a single parameter.
  //We use multiple parameter lists for curried functions.

  def sum(a: Int)(b: Int)(c: Int) = {
   println( a + b)
  }
  
  def main(args: Array[String]): Unit = {
     sum(2)(45)(45)
  }
  
}