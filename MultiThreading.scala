package ScalaMultiThreading_FileHandling
import java.io._
import scala.io.Source
class DemoThread extends Thread {

  override def run() {
    println("Created Thread by extending Thread class")
    
    for(i<- 1 to 10)
    {
      println(i)
      
      // Sleep method
      Thread.sleep(1000)
    }
    
    
    
  }

  // THREAD methods
 
  
}

class Demo extends Runnable {
  override def run() {
    println("Created Thread by extending Runnable trait")
  }
}

object MultiThreading extends Thread {

  def main(args: Array[String]): Unit = {
    // by extend thread class
    var t = new DemoThread()
    t.run()
    
    // by extend runnable trait
    
    var d=new Demo()
    
    var t1= new Thread(d)
    t1.run()
  }

}