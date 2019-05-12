package leetcode
package p38

object Solution1 {
  def toInt(c: Char): Int = c.toInt - '0'.toInt

  @annotation.tailrec
  def say(
      x: String,
      i: Int,
      ls: List[(Int, Int)],
      c: (Int, Int)
  ): List[(Int, Int)] =
    if (i >= x.length) c :: ls
    else if (toInt(x(i)) == c._2) say(x, i + 1, ls, (c._1 + 1, c._2))
    else say(x, i + 1, c :: ls, (1, toInt(x(i))))

  def concat(ls: List[(Int, Int)]): String =
    ls.reverse.foldLeft("") {
      case (s, (a, b)) => s + a.toString + b.toString
    }

  @annotation.tailrec
  def cas(n: Int, x: Int, s: String): String =
    if (x == n) s
    else {
      val s0 = toInt(s(0))
      val t = concat(say(s, 0, Nil, (0, s0)))
      cas(n, x + 1, t)
    }

  def countAndSay(n: Int): String = {
    cas(n, 1, "1")
  }
}
