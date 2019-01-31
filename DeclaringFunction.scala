package ScalaFuntion_Inheritance_Overload_Override

object DeclaringFunction {

  //Without = and  Without Parameters
  def sayhello() {
    println("Hello")

  }

  //Without = and With Parameters

  def sum(a: Int, b: Int) {
    println(a + b)

  }

  //With = and Without Parameters

  def func(): Int = {
    return 7
  }

  //With = and  With Parameters

  def sum1(a: Int, b: Int): Int = {
    return a + b
  }

  def main(args: Array[String]): Unit = {
    sayhello()
    sum(1, 6)
    println(func())
    println(sum1(8,3))
    
  }

}