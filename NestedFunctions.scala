package ScalaFuntion_Inheritance_Overload_Override

object NestedFunctions {
  // we can define a Scala function inside another. This is what a local function looks like:

  def outer() {

    println("In outer")

    def inner() {
      println("In inner")
    }

    inner()
  }

  def outer1(a: Int) {
    
    println("In outer")
    def inner1() {
      println(a * 3)
    }
    inner1()
    
  }

  def main(args: Array[String]): Unit = {
    outer()
    outer1(25)
  }

}