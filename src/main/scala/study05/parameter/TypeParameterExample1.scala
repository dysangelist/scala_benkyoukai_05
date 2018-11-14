package study05.parameter

import study05.SekaiKan._
object TypeParameterExample1 extends App {
  def printThingsInList[A](l: List[A]): Unit = {
    l.map { randomThing =>
        s"~*~ ${randomThing.toString} ~*~"
      }
      .foreach(println)
  }

//  printThingsInList((1 to 10).toList)
//  printThingsInList(List("a", "b", "c"))
  printThingsInList(l)
}
