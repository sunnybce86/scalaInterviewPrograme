

object DuplicateInString {

  var string = "How are you How are How"

  def main(args: Array[String]): Unit = {

    var stringArray: Array[String] = string.split(" ")
    var map: Map[String, Int] = Map()

    for (str <- stringArray) {
      if (map.contains(str)) {
        // overriding the key with updated value
        map += (str -> (map(str) + 1))
      } else {
        map += (str -> 1)
      }

    }
    
    

   /* map.keys.foreach { a =>
      println(
        a + "  " + map(a) + map.values.max)

      println(map(a).toString() == map.keys.max.toString())

      if (map(a).equals(map.keys.max)) {

        println("hello")
        println("Max repeated word " + println(map.keys + "  " + map(a)))
      } else {
        println("else")
      }

    }*/
    
    for(i<- map)
    {
      println(i._1 +" " + i._2)
      
       if (map.values.max==i._2) {
 
        println("Max repeated word " + i._1 + "  " + i._2)
        
      }
    }
    

  }
}