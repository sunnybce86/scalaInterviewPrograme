package String_Exception

/*
 *  we are going to see how can we Throw Custom Exception in Scala Programming Language.
 *  Scala lets you create your own custom exceptions using the Scala Throw Keyword. With
 *  this, you can explicitly throw an exception in your code.
 */

object CustomException extends App {

  def person(age: Int) {
    if (age != 15)
      throw new Exception("-----Wait a little------")
    else println("Enjoy your quinceanera")
  }

  
  // Using scala Annotation 
  /*@throws(classOf[IOException])
  @throws(classOf[LineUnavailableException])
  @throws(classOf[UnsupportedAudioFileException])
  def playSoundFileWithJavaAudio {
    //exception-throwing code
  }*/

  person(5)

}