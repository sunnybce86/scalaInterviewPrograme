

object OddNumber {
  
  def main(args: Array[String]): Unit = {

    for(i<-1 until 99)
    {
      val res= List(i)
      res.filter(a=>a%2!=0).foreach(f=>print(f +" "))
    }
  }
}