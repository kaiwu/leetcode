package leetcode
package p215

import scala.collection.mutable.PriorityQueue

/** Heap O(NlogK)
  *
  */
object Solution2 {
  def findKthLargest(nums: Array[Int], k: Int): Int = {
    val q = PriorityQueue.empty[Int](Ordering[Int].reverse)
    (0 until nums.length).foreach {
      case i => {
        q.enqueue(nums(i))
        val x = if (q.size > k) q.dequeue() else nums(i)
      }
    }
    q.dequeue()
  }
}
