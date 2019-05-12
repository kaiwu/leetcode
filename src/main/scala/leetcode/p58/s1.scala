package leetcode
package p58

object Solution1 {
  def find(ls: List[Char], n: Int, b: Boolean): Int = ls match {
    case h :: t if h == ' ' && b == false => find(t, n, b)
    case h :: t if h == ' ' && b == true  => n
    case h :: t if h != ' '               => find(t, n + 1, true)
    case nil                              => n
  }

  def lengthOfLastWord(s: String): Int = {
    val ls = s.toList.reverse
    find(ls, 0, false)
  }
}
