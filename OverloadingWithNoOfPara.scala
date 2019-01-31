package ScalaFuntion_Inheritance_Overload_Override

// overloading with no of parameter

class sayHello {
  def hello() {
    println("Hello, user")
  }
  def hello(admin: String) {
    println("Hello, " + admin)
  }
  def hello(admin: String, guest: String) {
    println("Hello, " + admin + ", Hello " + guest)
  }
}


object OverloadingWithNoOfPara extends App{
  val s=new sayHello()
  s.hello()
  s.hello("sunny")
  s.hello("sunny","Singh")
}