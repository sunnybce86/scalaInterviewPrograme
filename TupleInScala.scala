package ScalaCollection

object TupleInScala {
  // scala tuple is a class which can containe different data type (or we can object also) unlike list and array.
  // tuple are immutable in scala, you can change the value of tuple element once you declare.
  
  // define tuple
  
  val tuple=(5,"hello",6,"test")
  // or
  val tuple1=Tuple1(2)
  val tuple2=Tuple4(5,"hello",6,"test")
  
  def main(args: Array[String]): Unit = {
    
    println(tuple)
    println(tuple2)
    println(tuple2._1)
    println(tuple2._2)
   
    // iterate tuple using productIterator method
    
    tuple2.productIterator.foreach(f=>println(f))
    
    tuple2.productIterator.foreach{f=>println(f)}
    // element of map is a tuple
    println(""->1)
    
    //tuple within a tuple 
    
    println("test"->25->true->false)
    
    val tuple3=Tuple3("test",5,(3,"p"))
    println(tuple3)
  }
  
  
}