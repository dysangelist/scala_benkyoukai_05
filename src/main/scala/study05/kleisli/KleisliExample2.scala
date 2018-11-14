package study05.kleisli

object KleisliExample2 extends App {
  val add2 = (i: Int) => Some(i + 2)
  val times3 = (i: Int) => Some(i * 3)

  val add2AndTimes3 = add2.andThen(_.flatMap(times3))
  print(add2AndTimes3(2))
}
