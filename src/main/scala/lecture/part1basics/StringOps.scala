package lecture.part1basics

object StringOps extends App {
  val string: String = "hello, i am learning scala"

  println(string.charAt(2))
  println(string.substring(7, 11))
  println(string.split(" ").toList)
  println(string.startsWith("hello"))
  println(string.replace("scala", "a new language"))
  println(string.toUpperCase())
  println(string.length)
  println(string.concat(" today"))

  val aNumberString = "45"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ "z")
  println(string.reverse)


  val name = "Rafael"
  val age = 21
  val greeting = s"hello, my name is $name and i am $age years old"
  println(greeting)


  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f"
  println(myth)


  println(raw"this is a \n newline")

}
