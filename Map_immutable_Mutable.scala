package ScalaCollection

object Map_immutable_Mutable {

  def main(args: Array[String]): Unit = {

    // empty map

    var m: Map[String, Int] = Map()

    //map with values

    var m1: Map[String, Int] = Map("Rahul" -> 0, "Meghana" -> 2)

    // add element

    m1 += ("ruchi" -> 3)

    println(m1)

    //Operations on Map

    println("Keys===> " + m1.keys)
    println("Key of megha" + m1("Rahul"))
    println("Values===> " + m1.values)
    println(m.isEmpty)
    println(m1.isEmpty)
    
    //mutable map
    import scala.collection.immutable
    var m2: Map[String,Int] = Map("Megha" -> 3, "Ruchi" -> 2, "Becky" -> 4)
    val m5 =m1++m2
    println("concatenation of two map "+m5 )
    
    // iterarte key / value
    
    m2.keys.foreach{ a=>println(
       "Key--> "+ a+" "+" value-->" +m2(a))}
    
    println("Contains "+m2.contains("Megha"))
     
  }

}