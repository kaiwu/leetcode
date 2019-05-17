package leetcode
package p215

import utest._

object p215Test extends TestSuite {
  val tests = Tests {
    's1 - {
      assert(Solution1.findKthLargest(Array(3, 2, 1, 5, 6, 4), 2) == 5)
      assert(Solution1.findKthLargest(Array(3, 2, 3, 1, 2, 4, 5, 5, 6), 4) == 4)
    }
    's2 - {
      assert(Solution2.findKthLargest(Array(3, 2, 1, 5, 6, 4), 2) == 5)
      assert(Solution2.findKthLargest(Array(3, 2, 3, 1, 2, 4, 5, 5, 6), 4) == 4)
    }
  }
}
