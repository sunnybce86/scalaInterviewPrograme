package ScalaFuntion_Inheritance_Overload_Override

//When we don’t know how many arguments we will want to pass, we can use a variable argument for this:

object FunctionsWithVariableArguments {
  
  def sum(args: Int*): Int = {
    var result = 0
    for (arg <- args) {
      result += arg
    }
    println(result)
    result
  }

  def main(args: Array[String]): Unit = {
    sum(1)
    sum(1,6)
    sum(1,6,4)
  }
}