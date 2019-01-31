package ScalaMultiThreading_FileHandling

class DemoJoinMethod extends Thread {
  for (i <- 1 to 5) {
    println(i)
    Thread.sleep(1000)
  }
}

object JoinMethod extends App {
  
  var t1 = new DemoJoinMethod()
  var t2 = new DemoJoinMethod()
  var t3 = new DemoJoinMethod()

  t1.start()
  t2.start()
  t2.join()
  t3.start()

}