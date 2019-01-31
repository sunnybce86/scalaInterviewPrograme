
import java.util.Date
object PartialFunction {
  // is a funtion when we pass few argument not all argument is known as partiall funtion.
  val d =new  Date
  
  def debug(date: Date, msg : String)={
    
    println(date +"   "+ msg)
    
  }
  
  def main(args: Array[String]): Unit = {
    
    val sum= (a:Int,b:Int,c:Int)=> (a+b+c)
    
    println(sum(10,20,30)) // fully applied funtion
    val f=sum(10,20,_:Int)
    println(f(100)) // partially applied function
    
    val f1= debug(d,_:String)
    
    println(f1("message 1"))
    println(f1("message 2"))
   
    
  }
}