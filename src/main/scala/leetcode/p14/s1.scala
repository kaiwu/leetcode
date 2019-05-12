package leetcode
package p14

object Solution1 {
  @annotation.tailrec
  def all(chrs: List[Char], c: Char): Boolean = chrs match {
    case Nil              => true
    case h :: t if h != c => false
    case h :: t if h == c => all(t, c)
  }

  @annotation.tailrec
  def check(ss: Array[String], l: Int, i: Int, s: String): String =
    if (i == l) s
    else {
      val chrs = ss.map(_(i))
      if (all(chrs.toList, chrs(0))) check(ss, l, i + 1, s + chrs(0))
      else s
    }

  def longestCommonPrefix(strs: Array[String]): String = {
    if (strs.isEmpty) ""
    else {
      val shortest = strs.map(_.length).min
      if (shortest == 0) ""
      else check(strs, shortest, 0, "")
    }
  }
}
