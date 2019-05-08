package leetcode
package p1

import scala.collection.mutable

/**
  * One Pass Hash Table
  */
object Solution2 {
  @annotation.tailrec
  def find(
      nums: Array[Int],
      i: Int,
      t: Int,
      m: mutable.Map[Int, Int]
  ): Array[Int] =
    if (i >= nums.length) Array()
    else if (m.contains(nums(i))) Array(m(nums(i)), i)
    else {
      val x = t - nums(i)
      m(x) = i
      find(nums, i + 1, t, m)
    }

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val m = mutable.Map.empty[Int, Int]
    find(nums, 0, target, m)
  }
}
