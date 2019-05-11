package leetcode
package p9

object Solution1 {
  def reverse(x: Int, y: Int): Int =
    if (x == 0) y else reverse(x / 10, y * 10 + x % 10)
  def isPalindrome(x: Int): Boolean =
    if (x < 0) false
    else if (x < 10) true
    else x == reverse(x, 0)
}
