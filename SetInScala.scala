package ScalaCollection

object SetInScala {

  def main(args: Array[String]): Unit = {

    val set = Set(2, 8, 78, 8, 6)
    val set1 = Set("hello", "t", "t", "tesd")
    println(set)
    println(set1)
    println(set + 7)
    // checking element is present in set or not
    println(set(6))
    println(set.head)
    println(set.tail)
    println(set.isEmpty)
    println(set.max)
    println(set1.min)
      val set2 = Set(2, 8, 7, 45, 6)
    println(set.intersect(set2))
    println(set1)
    
    set.foreach(println)
    
    for(i<-set)
    {
      set(i)
    }
  }
}