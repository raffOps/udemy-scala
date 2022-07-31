package lecture.part1basics

object CBNvsCBV extends App {
  def callByValue(x: Long): Unit = {
    println(s"by value: $x")
    println(s"by value: $x")
  }

  def callByName(x: => Long): Unit = {
    println(s"by value: $x")
    println(s"by value: $x")
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())
}
