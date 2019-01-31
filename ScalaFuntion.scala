

object ScalaFuntion {

  //here we see that on the left of => is the list of parameters, and on the right is an expression it will return. 
  val add = (x: Int, y: Int, z: Int) => x + y + z

  val sayhi = () => (println("Hi"))

  def main(args: Array[String]): Unit = {
    println(add(2, 3, 7))

    sayhi()
  }
}