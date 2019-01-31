import scala.collection.mutable.HashMap
import scala.collection.mutable.LinkedHashMap
object SortHashMap {
import scala.collection.immutable.ListMap
   def main(args: Array[String]): Unit = {
      var m1: Map[String, Int] = Map("Rahul" -> 0, "Meghana" -> 2)

    println( ListMap(m1.toSeq.sortBy(_._1):_*))
     
   }
}