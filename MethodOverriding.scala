package ScalaFuntion_Inheritance_Overload_Override

class Person1 {

  def greet() {
    println("I'm a person")
  }
}

class Student1 extends Person1 {

  override def greet() {
    println("I'm a student")
  }
}
object MethodOverriding extends App {

  var s1 = new Student1()
  s1.greet()
  var p1 = new Person1()
  p1.greet()

  p1 = new Student1()
  p1.greet()

  // downcasting not possible
  //s1=new Person1()

}