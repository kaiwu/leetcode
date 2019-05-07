package leetcode
package p26

object Solution1 {
  def check(as: Array[Int], i: Int, j: Int, c: Int): Int =
    if (j >= as.length) c
    else if (as(i) == as(j)) check(as, i, j + 1, c)
    else {
      as(i + 1) = as(j)
      check(as, i + 1, j + 1, c + 1)
    }

  def removeDuplicates(nums: Array[Int]): Int =
    if (nums.isEmpty) 0
    else check(nums, 0, 0, 1)
}
