package ScalaMultiThreading_FileHandling

class Demo1 extends Thread {
  override def run() {

    // getting name of thread
    println(this.getName)
    println("Priority of " + this.getPriority())
    for (i <- 0 to 5) {
      println("d1")
      Thread.sleep(400)
    }
  }
}

class Demo2 extends Thread {
  override def run() {
    // getting name of thread
    println(this.getName)
    println("Priority of " + this.getPriority())
    println("d2")
    Thread.sleep(400)
  }
}

class Demo3 extends Thread {

  override def run() {
    // getting name of thread
    println(this.getName)
    println("Priority of " + this.getPriority())
    println("d3")
    Thread.sleep(400)
  }
}

object JoinExampleWithMoreExplanation extends App {

  var d1 = new Demo1();
  var d2 = new Demo2();
  var d3 = new Demo3()

  // setting name of thread
  d1.setName("Thread 1")
  d2.setName("Thread 2")
  d3.setName("Thread 3")

  d1.start()
  d1.join();
  d2.start()
  d3.start()
}