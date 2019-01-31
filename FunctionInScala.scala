

object FunctionInScala {

  def main(args: Array[String]): Unit = {

    println("-------------filter---------------")

    //The filter method takes a predicate function as its parameter and uses it to select all the elements in the
    //collection which matches the predicate. It will return a new collection
    val name: List[String] = List("anshul", "Raghu", "Rahul", "Ram", "tarun")

    println(s"$name")

    val filterName: List[String] = name.filter {
      a => (a.contains("Ra") || a.contains("ta"))
    }

    val notFilter: List[String] = name.filterNot { (a => a.contains("Ra")) }

    println(filterName)
    println(notFilter)
    println("-------------map and flatmap---------------")

    //The map method takes a predicate function and applies it to every element in the collection.
    val number: Seq[Integer] = Seq(1, 5, 8, 3, 11)

    val mapNumber: Seq[Int] = number.map(_ * 2)

    val mapList: List[String] = name.map(_ + " Hello")

    val toUpperList: List[String] = name.map(_.toUpperCase())

    println(mapNumber)
    println(mapList)
    println(toUpperList)

    println("-------------flatmap---------------")
    /*
     * The flatMap method takes a predicate function, applies it to every element in the collection. It then returns a
     *  new collection by using the elements returned by the predicate function.
     *  The flatMap method is essentially a combination of the map method being run first followed by the flatten method.
     */
    val namelist1: List[String] = List("anshul", "Raghu", "Rahul", "Ram", "tarun")
    val namelist2: List[String] = List("naveen", "navalkishore", "Ram", "peter", "rihaan")

    val combineList: List[List[String]] = List(namelist1, namelist2)

    println(combineList)
    println("-------------flatten method---------------")
    val flattenList: List[String] = combineList.flatten

    println(flattenList)

    val flatList: List[String] = combineList.flatMap(list => list)

    println(flatList)
    val abcd = List('a', 'b', 'c', 'd')
    //List(A, a, B, b, C, c, D, d)
    val flatList1: List[Char] = abcd.flatMap(ch => List(ch.toUpper, ch))
    println(flatList1)
    val number1: List[Int] = List(2, 3, 4)

    val flatList2: List[Int] = abcd.flatMap(a => List(a.hashCode(), a))
    val flatList3: List[Int] = number1.flatMap(a => List(a + 2, a))
    println("hashcode "+flatList2)
    println(flatList3)

    println("-------------min and max---------------")
    val numbers = Seq(11, 2, 5, 1, 6, 3, 9)

    println(numbers.max)
    println(numbers.min)
    println("-------------diff, intersect, union---------------")

    val num1 = Seq(1, 2, 3, 4, 5, 6)
    val num2 = Seq(4, 5, 6, 7, 8, 9)

    println(num1.diff(num2))
    println(num1.intersect(num2))
    println(num1.union(num2))

    println("-------------Check the Entire Collection for a Condition by FORALl---------------")
    val numbers1 = Seq(3, 7, 2, 9, 6, 5, 1, 4, 2)
    println(numbers1.forall(n => n < 10))
    println(numbers1.forall(n => n > 5))

    println("------------- Partitioning of a Collection ---------------")

    val numbers3 = List(3, 7, 2, 9, 6, 5, 1, 4, 2)
    val namesAndPrices: (Seq[Any], Seq[Any]) = numbers3.partition(p => p % 2 == 0)
    println(namesAndPrices)

    println("------------- lambda expression , reduce---------------")

    numbers3.filter(num => num % 2 != 0).toList.foreach(num => println(num + " "))

    val res: List[Int] = numbers3.filter(num => num % 2 != 0).sorted.toList //.foreach(num=>print(num+" "))
    println("lambda => " + res)
    val res2: Int = numbers3.filter(num => num % 2 != 0).reduce((a, b) => a + b)
    val res3: Int = numbers3.filter(num => num % 2 != 0).reduce(_ + _)
    println("Sum using reduce => " + res2 + " " + res3)

    println(s"minimum num = ${numbers3.reduce(_ min _)}")
    println(s"maximum num = ${numbers3.reduce(_ max _)}")

    println("------------- Sorting array using quickSort method ---------------")

    val fruits = Array("cherry", "apple", "banana")
    scala.util.Sorting.quickSort(fruits)

    println("------------- Sorting List, Vector, ArrayBuffer, Seq, and others ---------------")

    val numbers4 = List(3, 7, 2, 9, 6, 5, 1, 4, 2)

    println(numbers4.sorted)
    val b = List("banana", "pear", "apple", "orange").sorted
    println(b.sorted)

    List(10, 5, 8, 1, 7).sortWith(_ < _)

    List(10, 5, 8, 1, 7).sortWith(_ > _)

    List("banana", "pear", "apple", "orange").sortWith(_ < _)

    List("banana", "pear", "apple", "orange").sortWith(_ > _)

  }

}