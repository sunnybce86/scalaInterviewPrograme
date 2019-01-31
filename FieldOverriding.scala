package ScalaFuntion_Inheritance_Overload_Override

class Vehicle1 {
  val wheels = 0
}

class Car1 extends Vehicle1 {
  // feild overring
  //You can only override val fields; this won’t work with vars. This is because we can only read vals,
  //but we can both read and write vars.
  
  override val wheels = 4

  def show() {
    println("The car has " + wheels + " wheels")
  }
}

object FieldOverriding extends App {

  var c = new Car1()
  c.show()

}