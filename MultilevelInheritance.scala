package ScalaFuntion_Inheritance_Overload_Override

class A {
  println("A")
}

class B extends A {
  println("B")
}

class C extends B {
  println("C")
}

object MultilevelInheritance {
  
 def main(args: Array[String]): Unit = {
   new C()
 }

}