

object TableNumber {
  
  def table(n : Integer) ={
    
    for(i<- 1 until 11)
    {
      println("12"+ "x" + i + "="+n*i)
    }
    
  }
  
  def main(sts:Array[String]): Unit={
    
    table(12)
  }
}