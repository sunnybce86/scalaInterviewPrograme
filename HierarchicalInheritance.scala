package ScalaFuntion_Inheritance_Overload_Override

object HierarchicalInheritance {

  def main(args: Array[String]): Unit = {
    new Y()
    new Z()
  }
}

class X {
  println("X")
}

class Y extends X {
  println("Y")
   println("---")
}

class Z extends X {
  println("C")
}