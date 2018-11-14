package study05.partial

import study05.SekaiKan._

object PartialFunction1 extends App {
  l.foreach {
    case d: Dasha            => println(d.name)
    case t: Tokage           => println(t.name)
    case k: Katatsumuri      => println(k.name)
    case _: InitialledPerson => println("His name is just an initial!")
  }
}
