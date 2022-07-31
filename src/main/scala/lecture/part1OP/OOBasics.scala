package lecture.part1OP


class Person(val name: String, val age: Int) {

  def this(name: String) = this(name, 0) // useless

  def greet(name: String): Unit = {
    println(s"${this.name} says: Hi $name")
  }

  def greet(): Unit = {
    println(s"Hi, my name is ${this.name}")
  }
}


class Writer(val firstName: String, val surname: String, val year: Int) {
  def getFullName: String = {
    s"${this.firstName} ${this.surname}"
  }
}

class Novel(val title: String, val year: Int, val writer: Writer) {
  def getWriterAge: Int = {
    writer.year
  }

  def getWriter: String = {
    writer.getFullName
  }
}

object OOBasics extends App {
  val person = new Person(name = "Rafa", age = 21)
  println(person.age)
  person.greet(name = "Thiago")
  person.greet()
}