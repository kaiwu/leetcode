package leetcode
package p89

object Solution1 {
  def toInt(a: Array[Int], i: Int = 0, x: Int = 0): Int = {
    if (i >= a.length) x
    else
      toInt(a, i + 1, 2 * x + a(i))
  }

  def toList(n: Int): List[List[Int]] = n match {
    case 0 => List(List(0))
    case 1 => List(List(0), List(1))
    case n if n > 1 => {
      val ls = toList(n - 1)
      ls.map(l => 0 :: l) ++ ls.reverse.map(l => 1 :: l)
    }
  }

  def grayCode(n: Int): List[Int] = toList(n).map(l => toInt(l.toArray))
}
