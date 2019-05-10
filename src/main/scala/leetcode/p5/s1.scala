package leetcode
package p5

/** Brute Force
  *
  */
object Solution1 {
  def isPalindrom(s: String, i: Int): Boolean =
    if (i == s.length / 2) true
    else if (s(i) == s(s.length - 1 - i)) isPalindrom(s, i + 1)
    else false

  def dropBoth(s: String, l: Int, r: Int): String = s.drop(l).dropRight(r)
  def subs(s: String, i: Int): Seq[String] =
    for {
      x <- 0 to i
    } yield dropBoth(s, x, i - x)

  @annotation.tailrec
  def find(ls: List[String]): String = ls match {
    case Nil => ""
    case h :: t =>
      if (isPalindrom(h, 0)) h
      else find(t)
  }

  def longestPalindrome(s: String): String = {
    @annotation.tailrec
    def check(i: Int): String = {
      if (i >= s.length - 1) s.substring(0, 1)
      else {
        val x = find(subs(s, i).toList)
        if (x.length > 0) x
        else check(i + 1)
      }
    }
    if (s.length == 0) ""
    else check(0)
  }
}
