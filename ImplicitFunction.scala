
class DonutString(s: String) {

  def isFavoriteDonut: String= "Test ====>>"+ s

}

object ImplicitFunction 
{
 
  implicit def stringToDonutString(s: String) = new DonutString(s)
   
}
object Test{
    
    def main(args: Array[String]): Unit = {
     import ImplicitFunction._

    println("\nStep 4: How to create String values")
    val glazedDonut = "Glazed Donut"
    val vanillaDonut = "Vanilla Donut"

    println("\nStep 5: How to access the custom String function called isFavaoriteDonut")
    println(s"Is Glazed Donut my favorite Donut = ${glazedDonut.isFavoriteDonut}")
    println(s"Is Vanilla Donut my favorite Donut = ${vanillaDonut.isFavoriteDonut}")
  }
  }
