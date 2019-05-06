package leetcode
package p1

/**
  * = Two Sum =
  * @see See [[https://leetcode.com/problems/two-sum/]]
  */
object Solution1 {
  @annotation.tailrec
  def find(nums: Array[Int], i: Int, j: Int, t: Int): Array[Int] =
    if (j >= nums.length) find(nums, i + 1, i + 2, t)
    else if (nums(i) + nums(j) == t) Array(i, j)
    else find(nums, i, j + 1, t)

  def twoSum(nums: Array[Int], target: Int): Array[Int] =
    find(nums, 0, 1, target)
}
