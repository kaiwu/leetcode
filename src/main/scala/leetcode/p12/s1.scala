package leetcode
package p12

object Solution1 {
  val thds = Array[String]("", "M", "MM", "MMM")
  val hdrs =
    Array[String]("", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM")
  val tens =
    Array[String]("", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC")
  val ones =
    Array[String]("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX")

  @annotation.tailrec
  def parts(n: Int, i: Int, s: Int): Int =
    if (i > 0) parts(n / 10, i - 1, n % 10)
    else s

  def intToRoman(num: Int): String = {
    val ps = (1 to 4).map(parts(num, _, 0))
    thds(ps(3)) + hdrs(ps(2)) + tens(ps(1)) + ones(ps(0))
  }
}
