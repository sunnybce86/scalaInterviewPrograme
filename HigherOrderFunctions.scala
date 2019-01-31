package ScalaFuntion_Inheritance_Overload_Override

object HigherOrderFunctions {

  val name: String = "Ayushi"

  def sayhello(s: String) {
    println(s"Hello, $s")
  }

  def func(showMessege: String => Unit, s: String) {
    showMessege(s)
  }

  def main(args: Array[String]): Unit = {
    func(sayhello, "sunny")
  }
}