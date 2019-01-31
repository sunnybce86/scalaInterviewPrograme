case class Donut(name: String, price: Double, productCode: Option[Long] = None)


object DonutImplicits {
  println("\nStep 3: How to define an implicit class to augment or extend the Donut object with a uuid field")
  implicit class AugmentedDonut(donut: Donut) {
    def uuid: String = s"${donut.name} - ${donut.productCode.getOrElse(12345)}"
  }
}
object ImplicitClass {

  println("Step 1: How to define a case class to represent a Donut object")

  def main(args: Array[String]): Unit = {
    println("\nStep 2: How to create instances or objects for the Donut case class")
    val vanillaDonut: Donut = Donut("Vanilla", 1.50)
    println(s"Vanilla donut name = ${vanillaDonut.name}")
    println(s"Vanilla donut price = ${vanillaDonut.price}")
    println(s"Vanilla donut produceCode = ${vanillaDonut.productCode}")

    println("\nStep 4: How to import and use the implicit class AugmentedDonut from Step 3")
    import DonutImplicits._
    println(s"Vanilla donut uuid = ${vanillaDonut.uuid}")
  }

}

