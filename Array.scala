package ScalaCollection

object ArrayInScala {
  
  val res : Array[Int]= new Array[Int](4)
  val res1 = new Array[Int](4)
  val res2= Array(1,8,6,7)
  
  res(0)=12
  res(1)=23
  res(2)=34
  res(3)=56
  
  def main(args:Array[String]):Unit={
    
    for(i<- res)
    {
      println(i)
    }
    
    for(i<-0 to res.length-1)
    {
      println(res(i))
    }
    
    println(Array.concat(res,res2))
    
  }

}