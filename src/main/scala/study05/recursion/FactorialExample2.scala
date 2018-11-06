package study05.recursion

object FactorialExample2 extends App {
  def factorial(n: BigInt): BigInt = {
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
