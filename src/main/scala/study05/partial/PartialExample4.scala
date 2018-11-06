package study05.partial

import study05.SekaiKan.{Character, l}
import study05.SekaiKan._

object PartialExample4 extends App {

  val longNamePF: PartialFunction[Character, String] = {
    case c if c.name.length >= 2 => c.name
  }

  val initialPF: PartialFunction[Character, String] = {
    case c if c.name.length < 2 => "His name is just an initial!"
  }

  val c = longNamePF.orElse(initialPF)

  l.map(c)
    .foreach(println)
}
