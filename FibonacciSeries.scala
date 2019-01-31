

object FibonacciSeries {
  var a = 0
  var b = 1
  var temp = 0
        
  def fiboSeries(n: Integer) :Unit =
    {
      if (n > 0) {
       for (i <- 2 to n) {
          
          temp = a + b
          a = b
          b = temp
          print(temp + " ")
          //fiboSeries(n-1)
          }
      
      }
     
        
    }

  def main(args: Array[String]): Unit = {
    //var a = 0
    //var b = 1
    var num = 10
    print(a + " " + b + " ")
    fiboSeries(num)

  }
}