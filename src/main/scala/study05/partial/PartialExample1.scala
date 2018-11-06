package study05.partial

import study05.SekaiKan._

object PartialExample1 extends Object {
  object PartialFunction extends App {
    l.foreach {
      case d: Dasha            => print(d.name)
      case t: Tokage           => print(t.name)
      case k: Katatsumuri      => print(k.name)
      case _: InitialledPerson => print("His name is just an initial!")
    }
  }
}
