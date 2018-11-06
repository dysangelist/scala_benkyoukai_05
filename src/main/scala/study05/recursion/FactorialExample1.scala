package study05.recursion

object FactorialExample1 extends App {
  def factorial(n: BigInt): BigInt = {
    if (n <= 1)
      1
    else
      n * factorial(n - 1)
  }

  print(factorial(1400))

}
