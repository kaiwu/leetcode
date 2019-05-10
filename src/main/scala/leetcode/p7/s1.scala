package leetcode
package p7

object Solution1 {
  @annotation.tailrec
  def cal(i: Int, t: Long, p: Long): Long = {
    if (t > Int.MaxValue || t < Int.MinValue) 0
    else
      (i / 10) match {
        case x if x != 0 => cal(x, t.toLong + (i.toLong % 10) * p, p / 10)
        case x if x == 0 => t.toLong + (i.toLong % 10) * p
      }
  }

  @annotation.tailrec
  def hrd(x: Int, i: Long): Long =
    if (x.toLong / i == 0) i / 10 else hrd(x, i * 10)

  def reverse(x: Int): Int =
    cal(x, 0, hrd(x, 10L)).toInt
}
