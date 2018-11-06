package study05.recursion

import scala.annotation.tailrec

object FactorialExample3 extends App {

  def factorial(n: BigInt): BigInt = {

    @tailrec
    def go(acc: BigInt, n: BigInt): BigInt = {
      if (n <= 1)
        acc
      else
        go(acc * n, n - 1)
    }
    go(1, n)
  }

  print(factorial(1400))

}
