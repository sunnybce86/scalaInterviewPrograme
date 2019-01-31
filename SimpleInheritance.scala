package ScalaFuntion_Inheritance_Overload_Override

class Person {
  var SSN: String = "999-32-7869"
  
   def show()=
   {
    println("Parent")
   }
}

class Student extends Person {

  var enrolment_no: String = "0812CS141028"
  
  def show1()=
   {
    println("Child")
   }
  
  println("SSN: " + SSN)
  println("Enrolment Number: " + enrolment_no)

}

object SimpleInheritance {

  def main(args: Array[String]): Unit = {
    val prs = new Person();
    prs.show()
    // parent reference cannot call method// downcasting is not possible
    //prs.show1()
    val std = new Student()
    std.show1()
    std.show()
  }
}