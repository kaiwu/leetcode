package leetcode
package p19

import utest._
import leetcode.common.ListNode
import leetcode.common.ListNode._

object p19Test extends TestSuite {
  val tests = Tests {
    's1 - {
      assert(
        Solution1
          .removeNthFromEnd(ListNode(List(1, 2, 3, 4, 5)), 2) === ListNode(
          List(1, 2, 3, 5)
        )
      )
    }
  }
}
