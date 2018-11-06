package study05.partial

import study05.SekaiKan._

object PartialExample2 extends Object {
  object PartialFunction extends App {
    l.foreach {
      case c if c.name.length >= 2 => print(c.name)
      case _: InitialledPerson     => print("His name is just an initial!")
    }
  }
}
