package leetcode
package p53

import utest._

object p53Test extends TestSuite {
  val tests = Tests {
    's1 - {
      assert(
        Solution1.maxSubArray(Array(-2, 1, -3, 4, -1, 2, 1, -5, 4)) == 6
      )
    }
  }
}
