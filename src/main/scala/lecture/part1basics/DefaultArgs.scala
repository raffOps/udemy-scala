package lecture.part1basics

import scala.annotation.tailrec

object DefaultArgs extends App{
  @tailrec
  def getFactorial(number: BigInt, acc: BigInt = 1): BigInt = {
    if number <= 1 then
      acc
    else
      getFactorial(number-1, acc * number)
  }

  def savePicture(format: String = "jpg", widht: Int, height: Int): Unit =
    println("saving pictures")

  //println(getFactorial(5))
  savePicture(widht = 800, height = 900)
}
