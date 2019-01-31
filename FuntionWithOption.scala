

object FuntionWithOption {

  println("Step 1: How to define an Option in a function parameter")
  
  def areaOfCircle(radius: Integer,  pie: Option[Int]): Integer = {
    println(s"Calculating cost for $pie")
   1000  
  }
  
  def main(args: Array[String]): Unit = {
    println("Step 4: How to call a function which has an Option parameter with a default value")
    
    println(s"""Total cost with discount = ${areaOfCircle( 5, Some(56))}""")
  }

}