package study05.kleisli

object KleisliExample1 extends App {
  val add2 = (i: Int) => i + 2
  val times3 = (i: Int) => i * 3

  times3(add2(3))
  val add2AndTimes3 = add2.andThen(times3) // f(g(x)) f ⚪︎ g
  val times3AndAdd2 = add2.compose(times3) // g(f(x)) g ⚪︎ f

  println(add2AndTimes3(2))
  println(times3AndAdd2(2))

}
