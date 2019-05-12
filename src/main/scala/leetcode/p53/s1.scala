package leetcode
package p53

import Math.max

object Solution1 {
  def maxSubArray(nums: Array[Int]): Int =
    nums
      .foldLeft((Integer.MIN_VALUE, Integer.MIN_VALUE)) {
        case ((m, l), i) =>
          if (l > 0) (max(l + i, m), l + i)
          else (max(i, m), i)
      }
      ._1
}
