package leetcode
package p215

/** Sort O(NlogN)
  *
  */
object Solution1 {
  def findKthLargest(nums: Array[Int], k: Int): Int = {
    val ns = nums.sortBy(identity)
    ns(nums.length - k)
  }
}
