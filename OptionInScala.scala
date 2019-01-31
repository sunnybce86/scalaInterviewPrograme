

object OptionInScala {

  def main(args: Array[String]): Unit = {

    println("Step 1: How to use Option and None - a basic example")

    val status: Option[String] = Some("Status is True")

    val status1: Option[String] = None

    println(s"${status.get}")

    // throw exception
    //println(s"${status1.get}")

    println(s"${status1.getOrElse("test")}")

    println("\nStep 3: How to use Pattern Matching with Option")
    status1 match {
      case Some(name) => println(s"Received donut name = $name")
      case None => println(s"No donut name was found!")
    }

    // Some more example using list and map

    val list = List(5, 1, 2, 4)
    val map: Map[Int, String] = Map(1 -> "test", 2 -> "hello", 3 -> "demo")

    println("-->"+list.find(_ > 2))
    println(list.find(_ > 5))
    println(list.find(_ > 2).get)
    println(list.find(_ > 5).getOrElse("not present"))

    println("-->"+map.get(1))
    println(map.get(4))
    println(map.get(1).get)
    println(map.get(4).getOrElse("not present"))
    
    val op : Option[Int]=Some(25)
    val op1 : Option[Int]=None

    println(op.isEmpty)
    println(op1.isEmpty)
  }

}