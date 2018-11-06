package study05

object SekaiKan {

  trait Character {
    def name: String
  }
  case class Tokage(name: String = "Tokage") extends Character
  case class Katatsumuri(name: String = "Katatsumuri") extends Character
  case class Dasha(name: String = "Dasha", age: Int = 27) extends Character
  case class InitialledPerson(name: String = "A") extends Character

  val l = List(Tokage(), Katatsumuri(), Dasha(), InitialledPerson())

}
