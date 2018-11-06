package study05.recursion

import scala.annotation.tailrec

object FactorialExample4 extends App {

//  @tailrec
  def factorial(n: BigInt): BigInt = {
    if (n <= 1)
      1
    else
      n * factorial(n - 1) //recursive call is not in tail position
  }

  print(factorial(1400))

}
