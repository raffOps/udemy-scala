package lecture.part1basics

import scala.annotation.tailrec

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }


  def aRepeatedFunction(aString: String, n: Int): String = {
    if n == 1 then
      aString

    else  aString + aRepeatedFunction(aString, n-1)
  }

  def greetings(name: String, age: Int): String =
    s"hello, my name is $name and have $age years"

  def getFactorial(number: Int): Int = {
    if number == 1 then
      number
    else
      number * getFactorial(number-1)
  }

  def getNFibonacciNumber(n: Int): Int = {
    if n <= 2 then
      1
    else
      getNFibonacciNumber(n-1) + getNFibonacciNumber(n-2)
  }

  def isPrimeNumber(number: Int): Boolean = {

    @tailrec
    def _isPrimeNumber(dividend: Int, divisor: Int, limit: Double): Boolean = {
      if divisor > limit then
        true
      else if dividend % divisor == 0 then
        false

      else
        _isPrimeNumber(dividend, divisor+1, limit)
    }

    val limit: Double = scala.math.sqrt(number)
    _isPrimeNumber(number, 2, limit)
  }

  println(greetings("Ana", 12))
  println(getFactorial(5 ))
  println(getNFibonacciNumber(8))
  println(isPrimeNumber(904679083))
}

