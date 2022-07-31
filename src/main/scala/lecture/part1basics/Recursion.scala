package lecture.part1basics

import scala.annotation.tailrec

object Recursion extends App {
  def getFactorial(number: BigInt): BigInt = {
    @tailrec
    def _getFactorial(number: BigInt, acc: BigInt): BigInt = {
      if number <= 1 then
        acc
      else
        _getFactorial(number-1, number * acc)
    }

    _getFactorial(number, acc=1)
  }


  def getStringNTimes(string: String, n: Int): String = {

    @tailrec
    def _getStringNTimes(string: String, n: Int, acc: String): String = {
      if n < 1 then
        acc
      else
        _getStringNTimes(string, n-1, string+acc)
    }
    _getStringNTimes(string, n, acc="")
  }


  def isPrimeNumber(number: Int): Boolean = {
    @tailrec
    def _isPrimeNumber(dividend: Int, divisor: Int, limit: Double): Boolean = {
      if divisor > limit then
        true
      else if dividend % divisor == 0 then
        false

      else
        _isPrimeNumber(dividend, divisor + 1, limit)
    }
    val limit: Double = scala.math.sqrt(number)
    _isPrimeNumber(number, 2, limit)
  }

  //println(getFactorial(number = 5000))
  println(getStringNTimes("oi", 3))
  println(isPrimeNumber(87672))
}
