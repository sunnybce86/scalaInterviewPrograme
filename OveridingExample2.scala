package ScalaFuntion_Inheritance_Overload_Override

class Vehicle {
  def getNumberOfWheels() = {
    0
  }
}

class Car extends Vehicle {
  override def getNumberOfWheels() = {
    4
  }
}

class Bike extends Vehicle {
  override def getNumberOfWheels() = {
    2
  }
}

class Auto extends Vehicle {
  override def getNumberOfWheels() = {
    3
  }
}

object OveridingExample2 extends App {
  var c = new Car();
  println(c.getNumberOfWheels())
  var b=new Bike();
  println(b.getNumberOfWheels())
  var a=new Auto()
  println(a.getNumberOfWheels())

}

