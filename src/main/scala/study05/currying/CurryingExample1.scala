package study05.currying

object CurryingExample1 extends App {
  def add(a: Int)(b: Int): Int = a + b

  print(add(1)(3))
}
