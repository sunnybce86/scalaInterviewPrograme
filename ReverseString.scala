

object ReverseString {

  def reverString(str: String): Unit = {
    var revString = str.reverse
    println(revString)
  }

  def reversString1(s : String):Unit={
    val buf = new StringBuilder
    val len = s.length
    //println(len)
    for (i <- 0 to len-1) {
      buf.append(s.charAt(len - i - 1))
    }
    println(buf.toString)
  }
    
  
  def main(args: Array[String]): Unit = {
   reverString("sunny")
    reversString1("Test")
    
  }

}