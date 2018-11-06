package study05.partial

import study05.SekaiKan._

object PartialExample3 extends App {

  val longNamePF = new PartialFunction[Character, String] {
    def isDefinedAt(c: Character): Boolean = c.name.length >= 2

    def apply(c: Character): String = c.name
  }

  val initialPF = new PartialFunction[Character, String] {
    def isDefinedAt(c: Character): Boolean = c.name.length < 2

    def apply(v1: Character): String = "His name is just an initial!"
  }


  val c = longNamePF.orElse(initialPF)

  l.map(c)
    .foreach(println)
}
