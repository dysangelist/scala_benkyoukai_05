package study05.parameter

import study05.SekaiKan._
object TypeParameterExample2 extends App {
  def printThingsInList[A <: Character](l: List[A]): Unit = {
    l.map { randomCharacter =>
        s"~*~ ${randomCharacter.name} ~*~"
      }
      .foreach(println)
  }

  printThingsInList(l)
}
