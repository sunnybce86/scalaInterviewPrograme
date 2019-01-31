

object ClosuresFunction {

  // Example 1
  val c = 16

  val sum = (a: Int, b: Int) => {
    println((a + b) * c)
  }

  // Example 2

  var age = 22
  val sayhello = (name: String) => println(s"I am $name and I am $age")

  // Example 3 using higher order fn
  def func1(f: String => Unit, s: String) {
    f(s)
  }

  //  Example 4 using array

  val nums = Array(1, 2, 4)
  val saynum = (a: Int) => println(s"The number is $a")

  for (i <- 0 to 2) {
    saynum(nums(i))
  }

  //  Example 5 using array
  import scala.collection.mutable.ArrayBuffer
  
  val colors = ArrayBuffer("Red", "Green", "Blue")
  
  val func=(f:String=>Unit, s:String) =>f(s)

  def main(args: Array[String]): Unit = {
    sum(3, 5)
    sayhello("'sunny'")
    func1(sayhello, "Ayushi")
    
    for(i<-0 to 2){
      func(sayhello,colors(i))
    }
  }

}