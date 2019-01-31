

object PatterMatching {

  def main(args: Array[String]): Unit = {

    val status = "True"
    val lis = List(5, 8, 2, 1)
    var fstatus = status match {
      case "true" | "True" => "Status is True"
      case "fasle" => "Status is false"

      case _ => "No Status"
    }

    var evenList = lis match {
      case list if (list.contains(1) | list.contains(5)) => "Even number"
      case list if (list.contains(2) | list.contains(5)) => for (i <- 1 to 5) {
        println(i)
      }
    }

    println(s"$fstatus")
    print(s"$evenList")
  }

}