package ScalaFuntion_Inheritance_Overload_Override

object RecursionFunction {
  
  def recusion(a:Int) : Int=
  {
    if(a==0)
       1
    else
      a*recusion(a-1)
    
  }
  
  def main(args: Array[String]): Unit = {
    val n=5
   println(recusion(n))
  }
  
}