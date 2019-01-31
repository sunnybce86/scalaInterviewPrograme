

object StreamVersusList {
  def main(args: Array[String]): Unit = {

     println("--------- append the element from begining using :: method of List---------")
    var list1 = List(1, 2, 3, 4)
    
    // append the element from begining
    println(0 :: list1)
    
    // ::: method is used to concatenate the elements of a given list in front of this list.
  
     println("--------- ::: method is used to concatenate the elements of a given list in front of this list---------")
     
     var list2 = List(3,4,5)
     var list3 = List(1,2)
     
     val list4 = List(1,2) ::: list1
     println(list4)
     
     println("--------- append the element from begining using #:: method--------- of Stream------")
     
     var s1 = Stream(1,2,3,4)
     var s2 = 5 #:: s1
      println(s2)
      println("--------- append the element from begining using #::: method--------- of Stream------")
     //In Stream class, #::: method is used to concatenate a given stream at beginning of the stream. Only 
     //this newly added element is evaluated and followed by lazily evaluated stream elements.
     
     var s3 = Stream(1,2,3,4)
    val s4 = Stream(-1,0) #::: s1
    
    print(s4)
     
     
     
  }

}