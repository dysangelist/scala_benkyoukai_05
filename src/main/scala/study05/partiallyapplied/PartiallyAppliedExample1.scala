package study05.partiallyapplied

object PartiallyAppliedExample1 extends App {
  def add(a: Int)(b: Int): Int = a + b

  val addToOne: Int => Int = add(1) _
  println(addToOne(3))
  println(addToOne(5))

}
