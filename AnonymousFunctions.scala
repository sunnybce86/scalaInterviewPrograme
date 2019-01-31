package ScalaFuntion_Inheritance_Overload_Override

object AnonymousFunctions {
  
  val sum = (a: Int, b: Int) => println(a + b)
  val x = () => println("Hello")

  def main(args: Array[String]): Unit = {
    sum(5, 8)
    x()
  }
}