package leetcode
package p11

import utest._
import leetcode.common.ListNode

object p11Test extends TestSuite {
  val tests = Tests {
    's1 - {
      assert(Solution1.maxArea(Array(1, 8, 6, 2, 5, 4, 8, 3, 7)) == 49)
    }
  }
}
