

object IfElseAsExpression {
  
  
  def main(args: Array[String]): Unit = {
    val count=5
    val countStatus= if(count>10) "count is greater then 10" else  "count is less then 10"
    print(s"$countStatus")
  }
}