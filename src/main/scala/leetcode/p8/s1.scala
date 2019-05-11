package leetcode
package p8

object Solution1 {
  // +dddd
  // -dddd
  def convert(cs: List[Char], s: Long, d: Boolean, sign: Int): Long = {
    if (s * sign > Int.MaxValue) Int.MaxValue
    else if (s * sign < Int.MinValue) Int.MinValue
    else
      cs match {
        case Nil                              => s * sign
        case h :: t if d == false && h == ' ' => convert(t, s, d, sign)
        case h :: t if d == false && h == '+' => convert(t, s, true, 1)
        case h :: t if d == false && h == '-' => convert(t, s, true, -1)
        case h :: t if h.isDigit == false     => s * sign
        case h :: t if h.isDigit => {
          val x = s * 10 + (h - '0').toLong
          convert(t, x, true, sign)
        }
      }
  }

  def myAtoi(str: String): Int = convert(str.toList, 0, false, 1).toInt
}
