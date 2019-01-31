package ScalaFuntion_Inheritance_Overload_Override

class A1 {
  def greet() {
    print("A")
  }
}

class B1 extends A1 {
  // if you not override modifier it will give compile time error
  /*def greet() {
    print("B")
  }*/
}

object OveridingExample3  {
def main(args: Array[String]): Unit = {
  
}
}