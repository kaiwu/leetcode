package leetcode
package p11

import Math.min

object Solution1 {
  @annotation.tailrec
  def maxWater(hs: Array[Int], i: Int, j: Int, m: Int): Int = {
    if (i == j) m
    else {
      val w = (j - i) * min(hs(i), hs(j))
      (w - m) match {
        case x if x > 0 && hs(i) < hs(j)   => maxWater(hs, i + 1, j, w)
        case x if x > 0 && hs(i) >= hs(j)  => maxWater(hs, i, j - 1, w)
        case x if x <= 0 && hs(i) < hs(j)  => maxWater(hs, i + 1, j, m)
        case x if x <= 0 && hs(i) >= hs(j) => maxWater(hs, i, j - 1, m)
      }
    }
  }

  def maxArea(height: Array[Int]): Int =
    maxWater(height, 0, height.length - 1, 0)
}
