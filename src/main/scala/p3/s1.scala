package leetcode
package p3

import Math.max

object Solution1 {
  def lengthOfLongestSubstring(s: String): Int = {
    def find(i: Int, j: Int, c: Int, m: Int): Int = {
      if (j >= s.length) max(c, m)
      else {
        val x = s.substring(i, j)
        if (x.contains(s(j))) find(i + 1, j, c - 1, max(c, m))
        else find(i, j + 1, c + 1, m)
      }
    }
    if (s.length == 0) 0
    else find(0, 1, 1, 1)
  }
}
