package leetcode
package p35

object Solution1 {
  @annotation.tailrec
  def find(ns: Array[Int], i: Int, j: Int, x: Int): Int = x match {
    case a if a <= ns(i) => i
    case a if a > ns(j)  => j + 1
    case a if a == ns(j) => j
    case _               => find(ns, i + 1, j - 1, x)
  }

  def searchInsert(nums: Array[Int], target: Int): Int = {
    find(nums, 0, nums.length - 1, target)
  }
}
