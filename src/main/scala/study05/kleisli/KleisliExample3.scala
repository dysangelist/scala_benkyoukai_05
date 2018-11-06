package study05.kleisli

import cats.data.Kleisli
import cats.implicits._

object KleisliExample3 extends App {
  val add2: Kleisli[Option, Int, Int] = Kleisli { (i: Int) =>
    Some(i + 2)
  }
  val times3: Kleisli[Option, Int, Int] = Kleisli { (i: Int) =>
    Some(i * 3)
  }

  val times3Andadd2 = add2.compose(times3)
  val add2AndTimes3 = add2.andThen(times3)

  println(times3Andadd2(2))
  println(add2AndTimes3(2))

}
