package leetcode
package p16

import Math.abs

object Solution1 {
  def closer(s: Int, x: Int, t: Int): Int =
    if (abs(s - t) < abs(x - t)) s else x

  def check(ns: Array[Int], i: Int, j: Int, k: Int, x: Int, t: Int): Int =
    if (i >= ns.length - 2) x
    else {
      val c = if (j < k) {
        val sum = ns(i) + ns(j) + ns(k)
        sum match {
          case s if s == t => s
          case s if s > t  => check(ns, i, j, k - 1, closer(sum, x, t), t)
          case s if s < t  => check(ns, i, j + 1, k, closer(sum, x, t), t)
        }
      } else x
      if (c == t) c
      else check(ns, i + 1, i + 2, ns.length - 1, c, t)
    }

  def threeSumClosest(nums: Array[Int], target: Int): Int = {
    val ns = nums.sortBy(identity)
    check(ns, 0, 1, ns.length - 1, Int.MaxValue, target)
  }
}
