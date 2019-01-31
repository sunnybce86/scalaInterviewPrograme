package ScalaFuntion_Inheritance_Overload_Override

class Calculator {
  def sum(a: Int, b: Int) {
    var sum = a + b
    println(sum)
  }
  def sum(a: Double, b: Double) {
    var sum = a + b
    println(sum)
  }
}

object OverloadingWithDataType extends App {
  val c = new Calculator()
  c.sum(1, 2)
  c.sum(1.1, 2.2)

}