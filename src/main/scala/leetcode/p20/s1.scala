package leetcode
package p20

object Solution1 {
  def toInt(c: Char): Int = c match {
    case '(' => 1
    case ')' => -1
    case '[' => 2
    case ']' => -2
    case '{' => 3
    case '}' => -3
    case _   => 0
  }

  def isValid(l: List[Int], s: List[Int], n: Int): Boolean = l match {
    case Nil              => n == 0
    case h :: t if h >= 0 => isValid(t, h :: s, n + h)
    case h :: t if h < 0 =>
      if (s.isEmpty == false && s.head + h == 0) isValid(t, s.tail, n + h)
      else false
  }

  def isValid(s: String): Boolean =
    isValid(s.map(toInt).toList, List[Int](), 0)
}
