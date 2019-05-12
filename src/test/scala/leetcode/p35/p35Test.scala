package leetcode
package p35

import utest._

object p35Test extends TestSuite {
  val tests = Tests {
    's1 - {
      assert(Solution1.searchInsert(Array(1, 3, 5, 6), 5) == 2)
      assert(Solution1.searchInsert(Array(1, 3, 5, 6), 2) == 1)
      assert(Solution1.searchInsert(Array(1, 3, 5, 6), 7) == 4)
      assert(Solution1.searchInsert(Array(1, 3, 5, 6), 0) == 0)
    }
  }
}
