package String_Exception

//Please go through this link for remainig method https://data-flair.training/blogs/scala-string-method/

object ScalaStringMethods extends App {
  //1. char charAt(int index)
  //This method returns the character at the index we pass to it. Isn’t it so much like Java?

  println("Ayushi".charAt(1))

  // 2. int compareTo(Object o)
  //This Scala String Method compares a string to another object.
  // if equal then 1 else 0
  println("Ayushi".compareTo("Ayushi"))

  //3- Boolean equals(Object anObject)
  //This Scala String Method returns true if the string and the object are equal; otherwise, false.

  val b = Array('A', 'y', 'u', 's', 'h', 'i')

  println("Ayushi".equals(b))

  println("Ayushi".equals("ayushi"))
  println("Ayushi".equals("Ayushi"))
  // here one is array type and other is string type- false
  val b1 = Array("Ayushi")
  println("Ayushi".equals(b1))

  val b2 = Array("Ayushi")
  println("--" + b2.equals(b1)) // true
  // comping string and integer -falsr
  println("7".equals(7))

  //Boolean equalsIgnoreCase(String anotherString)-true
  println("Ayushi".equalsIgnoreCase("aYushi"))

  //char[] toCharArray()

  print("Ayushi".toCharArray())

  "7".toString() // o/p
  //res108: String = 7

  println("---------------Equals amd == operator method-----------")

  val s1 = "Hello"
  val s2 = "Hello"
  val s3 = "H" + "ello"

  println(s1 == s2)
  println(s1.equals(s2))

  println(s1 == s3)
  println(s1.equals(s3))

  //A pleasant benefit of the == method is that it doesn’t throw a NullPointerException on a basic test if a String is null

  val s4: String = null
  println(s1==s4)
  println(s1.equals(s4))
  
  //However, be aware that calling a method on a null string can throw a NullPointerException:
   val s6:String = null
   val s7:String = null
  
   println(s6.toUpperCase == s7.toUpperCase)
   println(s6.toUpperCase.equals(s7.toUpperCase))
  
}