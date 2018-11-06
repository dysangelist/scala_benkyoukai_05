package study05.partiallyapplied

object PartiallyAppliedExample1 extends App {
  def add(a: Int)(b: Int): Int = a + b

  val addToOne = add(1) _
  print(addToOne(3))
}
