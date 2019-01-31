package ScalaFuntion_Inheritance_Overload_Override

object NamedArguments {

  //When we want to pass arguments to a Scala function in a different order, we can pass them with names
  
  def diff(a: Int, b: Int): Unit = {
   println(b - a)
  }

  def main(args: Array[String]): Unit = {
    diff(2, 3)
    // nameed argument 
    diff(b=13,a=2)
    
  }
}