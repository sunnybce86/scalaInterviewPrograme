

object DuplicateCharacter {
  
  def main(args: Array[String]): Unit = {
    
    var strg="sunny"
    
    var charArray : Array[Char]   = strg.toCharArray()
    
    var map : Map[Char, Int] = Map()
    
    for(chr<-charArray)
    {
      if(map.contains(chr))
      {
         map += (chr -> (map(chr) + 1))
      }else
      {
       map+= (chr->1) 
      }
    }
    
    for(m<-map)
    {
      println(m._1 +" -->"+ m._2)
      
      if(m._2==map.values.max)
      {
        println("maximum repeated "+m._1 +" "+ m._2)
      }
      
    }
  }
}