package lecture.part1basics

object Expressions extends App {
  val x = 1 + 2
  println(x)

  // if expressions
  println(if(x > 4) 'a' else 3)

  var n = 7
  println(n)
  n = 8
  println(n)

  val aCondition = true

  // if instruction
  if aCondition then
    println(n)
    println(n)
  else
    println(n+1)


  //val aWeridValue = (aVariable = 3)


  // 1. difference betweenn "hello world" and println("hello world")

  // first is expression evaluated to string value. Second is a instruction, with side side effcet that print a string "hello world"


  // boolean type
  val someValue = {
    2 < 3
  }


  // int type
  val someOtherValue = {
    if(someValue) 239 else 908
    42
  }

}
