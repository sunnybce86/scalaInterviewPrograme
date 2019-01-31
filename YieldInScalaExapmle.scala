

object YieldInScalaExapmle {

  def main(args: Array[String]): Unit = {

    case class Person(
      name: String,
      isMale: Boolean,
      children: Person*)

    val lara = Person("Lara", false)
    val bob = Person("Bob", true)
    val julie = Person("Julie", false, lara, bob)

    val persons = List(lara, bob, julie)

    //println(persons)

    val persons1 = persons.filter(p => !p.isMale).flatMap(p => (p.children.map(p => p.name)))
    //println(persons1)
    for (p <- persons; if !p.isMale; c <- p.children)
      yield (print(p.name + " -->"), println(c.name))

    val name = for (
      p <- persons;
      n = p.name;
      if (n.startsWith("Ju"))
    ) yield n

    println("Name start with Ju--> " + s"$name")

    println("----------------Employee Section----------")

    case class Employee(name: String, age: Int)

    val ram = Employee("ram", 250)
    val vicky = Employee("vicky", 10)
    val rahul = Employee("rahul", 63)

    val employee = List(ram, vicky, rahul)
    val ageList = List()
    val prices: List[Int] = for (res <- employee) yield res.age

    print("Max salary of employee==> " + prices.max)

    println("-------------Querying with for expressions----------")

    case class Book(title: String, author: String*)

    val book: List[Book] = List(
      Book(
        "Structure and Interpretation of Computer Programs",
        "Abelson, Harold", "Sussman, Gerald J."),
      Book(
        "Principles of Compiler Design",
        "Aho, Alfred", "Ullman, Jeffrey"),
      Book(
        "Java",
        "Wirth, Niklaus"),
      Book(
        "Scala",
        "Ullman, Jeffrey"),
      Book(
        "C sharp",
        "Gosling, James", "Joy, Bill", "Steele, Guy", "Bracha, Gilad"))

    val title = for {
      b <- book
      a <- b.author
      if (a.startsWith("Gosling"))
    } yield b.title

    println("Book start with Gosling " + title)

    val title1 = for (
      b <- book if (b.title.indexOf("Program") > 0)

    ) yield b.title

    println("Book start with Gosling " + title1)

    val author = for (
      b1 <- book; b2 <- book if (b1 != b2);
      a1 <- b1.author; a2 <- b2.author if (a1 == a2)

    ) yield a1

    println(author)

    val res = book flatMap (b1 =>
      book filter (b2 => b1 != b2) flatMap (b2 =>
        b1.author flatMap (a1 =>
          b2.author filter (a2 => a1 == a2) map (a2 =>
            a1))))
    println(res)

    println("map funtion  " + book.map(f => f.title + "-->"))
    println(book.map(f => f.author.map(_.toUpperCase())).flatten);
    // same output

    println(book.flatMap(f => f.author.map(_.toUpperCase())))

    println(book.flatMap(f => List(f.author, f.title)))
    //println(book.flatMap(f=>f.author, f.author+"test"))

    // -----All below method is use to apply binary operator to each element of collection and the result
    //of each step will pass to next step

    // 1- reduce method take binary operator funtion as a parameter.

    val list = List(1, 2, 3, 4, 5, 6, 7)
    val list2 = List("A", "B", "C")

    println(list.reduce(_ + _));
    println(list2.reduce(_ + _));

    println("-------------reduceLeft----------")
    println(list.reduceLeft(_ + _));
    println(list2.reduceLeft(_ + _));

    val res3 = list.reduceLeft((x, y) => { println(x + ", " + y); x + y; })
    println(res3)

    println("-------------reduceRight----------")
    println(list.reduceRight(_ + _));
    println(list2.reduceRight(_ + _));

    println(list.reduceRight(_ - _));
    //println(list2.reduceRight(_ - _));

    val res5 = list.reduceRight((x, y) => { println(x + ", " + y); x - y; })
    println(res5)

    println("-------------FoldRight----------")
    //it same as reduceright except we can pass initial argument in fold left and fold right

    println(list2.foldRight("t")(_ + _))
    println(list.foldRight(10)(_ - _))

    println("-------------FoldLeft----------")
    
    println(list2.foldLeft("t")(_ + _))
    println(list.foldLeft(10)(_ - _))
    
    
    println("----thid will print intermediate element List ---------scanLeft----------")
     println(list.scanLeft(10)(_ + _))
    
    println("-------------scanRight----------")
    println(list.scanRight(10)(_ + _))
    
    

  }
}