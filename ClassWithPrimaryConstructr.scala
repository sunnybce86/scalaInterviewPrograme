class Person(SSN: Int, Name: String) {
  def sayhi() {
    println("I'm " + Name + " and my Social Security Number is " + SSN)
  }
}

object ClassWithPrimaryConstructr {
 
  def main(args: Array[String]): Unit = {
     val person = new Person(101, "sunny")
     
     person.sayhi()
  }
}