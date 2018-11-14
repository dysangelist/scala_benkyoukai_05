package study05.practice

import scala.annotation.tailrec

object DividedBy extends App {
  /*
   * A: List(1 .. 1000)に対して、B: List(1 .. 20)で少数なく割り算できるものを出力するプログラムを書いてください。
   * AがList(1 .. 10)で、Bが List(2, 3)の場合の出力が
   * Numbers divisible by 2 are List(2, 4, 6, 8, 10)
   * Numbers divisible by 3 are List(3, 6, 9)
   *
   *（ちなみに私の回答は4行です。🌟）
   */

  @tailrec
  def hoge(ls: List[Int], ds: List[Int]): List[Int] = {
    ds match {
      case h :: t => hoge(ls.filter(_ % h == 0), t)
      case Nil    => ls
    }
  }

  val a = (1 to 1000).toList
  val b = (1 to 3).toList
  print(hoge(a, b))

}
