package study05.returnsample

object ReturnExample1 extends App {
  def f1(n: Int): Int = {
    if (n == 1)
      return 1
    else 10
  }

  def f2(n: Int): Int = {
    val b = return 1
    if (n == 1)
      b
    else 10
  }

  println(f1(2))
  println(f2(2))

}
