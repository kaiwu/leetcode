package leetcode
package p24

import utest._

import leetcode.common.ListNode
import leetcode.common.ListNode._

object p24Test extends TestSuite {
  val tests = Tests {
    's1 - {
      val n1 = ListNode(List(1, 2, 3, 4))
      val n2 = ListNode(List(2, 1, 4, 3))
      assert(Solution1.swapPairs(n1) === n2)
    }
  }
}
