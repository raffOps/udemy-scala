package lecture.part1OP


class Person(val name: String, val age: Int) {

  def greet(name: String): Unit = {
    println(s"$this.name says: Hi $name")
  }
}

object OOBasics extends App {
  val person = new Person(name = "Rafa", age = 21)
  println(person.age)
  person.greet(name = "Thiago")
}