package leetcode
package p13

object Solution1 {
  def romanToInt(s: String): Int = {
    val ss = s
      .replace("IV", "IIII")
      .replace("IX", "VIIII")
      .replace("XL", "XXXX")
      .replace("XC", "LXXXX")
      .replace("CD", "CCCC")
      .replace("CM", "DCCCC")

    ss.foldLeft(0) {
      case (i, c) if c == 'I' => i + 1
      case (i, c) if c == 'V' => i + 5
      case (i, c) if c == 'X' => i + 10
      case (i, c) if c == 'L' => i + 50
      case (i, c) if c == 'C' => i + 100
      case (i, c) if c == 'D' => i + 500
      case (i, c) if c == 'M' => i + 1000
      case (i, _)             => i + 0
    }
  }
}
