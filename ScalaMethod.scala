

object ScalaMethod {
  
  //A method is similar to a function, but we define it using the keyword ‘def
  //We denote the return type after a colon after the parameter list. Also, here, we use = instead of =>.
  def squared(x:Int):Int=x*x
  
  def main(args : Array[String])={
   println(squared(3)) 
  }
}