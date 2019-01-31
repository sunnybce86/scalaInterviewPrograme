package ScalaFuntion_Inheritance_Overload_Override

object DefaultArgumentsFuntion {
  
  def defaultargs(a:Int,b:Int=7)=
  {
    println(a*b)
  }
  
  def main(args: Array[String]): Unit = {
     defaultargs(2)
      defaultargs(2,6)
  }
}