package leetcode
package p28

object Solution1 {
  @annotation.tailrec
  def find(h: String, x: String, n: Int): Int =
    if (n > h.length - x.length) -1
    else if (h.substring(n, n + x.length) == x) n
    else find(h, x, n + 1)

  def strStr(haystack: String, needle: String): Int =
    if (needle.isEmpty) 0
    else find(haystack, needle, 0)
}
