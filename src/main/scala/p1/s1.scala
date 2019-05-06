package leetcode
package p1

/**
  * Brute Force
  */
object Solution1 {
  @annotation.tailrec
  def find(nums: Array[Int], i: Int, j: Int, t: Int): Array[Int] =
    if (i >= nums.length) Array.empty[Int]
    else if (j >= nums.length) find(nums, i + 1, i + 2, t)
    else if (nums(i) + nums(j) == t) Array(i, j)
    else find(nums, i, j + 1, t)

  def twoSum(nums: Array[Int], target: Int): Array[Int] =
    find(nums, 0, 1, target)
}
