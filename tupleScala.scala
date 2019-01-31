

package ScalaCollection

object tupleScala {

  def main(args: Array[String]): Unit = {
    val tuple = Tuple2("sunny", 10)

    print(tuple._1 + "   " + tuple._2)

    println("\nStep 4: How to use pattern matching on Tuples")

    val tuple1 = Tuple3("Strawberry Donut", "Very Tasty", 2.50)
    val tuple2 = Tuple3("Plain Donut", "Tasty", 2)
    val tuple3 = Tuple3("Plain Donut", "Tasty", 2)

    // create list of tuples

    val tupleList = List(tuple1, tuple2, tuple3)

    tupleList.foreach { tuple =>
      {
        tuple match {

          case d if d._1=="Strawberry Donut" => print(s"price ${d._3}")
          case _ => "None"

        }
      }
    }

  }
}