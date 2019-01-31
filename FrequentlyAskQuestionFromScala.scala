import java.io.FileNotFoundException
import java.io.FileReader
import java.io.IOException

object FrequentlyAskQuestionFromScala {

  //https://www.scala-lang.org/old/faq.1.html

  // while loop should be more efficien
  def main(args: Array[String]): Unit = {

    for (i <- 1 to 10) {
      // println(i)
    }

    var i = 1
    while (i <= 10) {
      //println(i)
      i = i + 1
    }
  }

  // exception handling with pattern matching

  def foo: Unit = {

    val x = 5
    val y = 0
    try {
      println("Division of x / y = " + (x / y));

    } catch {
      case e: ArithmeticException => { println("Cannot divide a number by zero") }
      case e: IOException => { e.printStackTrace(); e.toString() }
      case e: Exception => { e.printStackTrace(); e.toString() }
    } finally {
      //in.close()
    }
  }
  println("Return value: " + foo)

  import java.io.FileReader
  import java.io.FileNotFoundException
  import java.io.IOException

  def foo1: Unit = {
    try {
      val f = new FileReader("input.txt")
    } catch {
      case ex: FileNotFoundException => { println("Missing file exception") }
      case ex: IOException => { println("IO Exception") }
      case ex: IOException => { println("IO Exception") }
    }
  }

  println("Return value: " + foo)

  /*How do you code "break" and "continue"?
These keywords are not included in Scala 2.7, and must be implemented in a different way. For break, the simplest thing to do is to divide your code into smaller methods and use the return to exit early. For continue, a simple approach is to place the skipped-over parts of a loop into an if.

Scala 2.8 will include break, but not continue.


 How does a case class differ from a normal class?
You can do pattern matching on it,
You can construct instances of these classes without using the new keyword,
All constructor arguments are accessible from outside using automatically generated accessor functions,
The toString method is automatically redefined to print the name of the case class and all its arguments,
The equals method is automatically redefined to compare two instances of the same case class structurally rather than by identity.
The hashCode method is automatically redefined to use the hashCodes of constructor arguments.
Most of the time you declare a class as a case class because of point 1, i.e. to be able to do pattern matching on its instances. 
But of course you can also do it because of one of the other points.
The code example below makes use of two of the characteristics of case classes:

Instances are created without resorting to the new keyword (point 2), for example in
List(MyInt(1), MyInt(2), MyInt(3))
Constructor arguments are accessed from "outside" using the automatically generated accessor functions (point 3), in
else m.asInstanceOf[MyInt].x == x;

Why do I have to use a different syntax for lists and streams in Scala? More precisely, why is it impossible
 to implement :: and ::: operations for the Stream class?
The ::: operator is already used for List concatenations, like in List(1,2,3) ::: List(4,5,6) gives List(1,2,3,4,5,6).

Also, we had to make a choice on which operators become right-associative. We chose that everything that ends in a ":" would be so, which means 
that a ::: b ::: c is translated to method calls c.:::(b).:::(a). Since streams are usually infinite, it would not make much sense to use 
right-associative operations in this way, so one would need to use another character as the last character, for example ::+

Does currying in Scala imply some performance penalty?
Currying per se does not have a performance penalty. If f and g are methods defined as

  def f(x: Int)(y: Int) = expr
  def g(x: Int, y: Int) = expr
then f(x)(y) and g(x, y) are compiled into exactly the same code.

 What does it mean that Scala is compatible with Java?
The standard Scala backend is a Java VM. Scala classes are Java classes,
and vice versa. You can call the methods of either language from methods in the other one
. You can extend Java classes in Scala, and vice versa. The main limitation is that some Scala
features do not have equivalents in Java, for example traits.

Are Java 1.5 generics available in Scala?
In Scala Version 2.7.0, Java generics were made visible to Scala programs.  In Scala Version 2.7.2,
Scala generics were made visible to Java programs.  However, higher-kinded type parameters are not usable
from Java programs.


  */

}