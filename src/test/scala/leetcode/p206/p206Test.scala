package leetcode
package p206

import utest._
import leetcode.common.ListNode

object p9Test extends TestSuite {
  val tests = Tests {
    's1 - {
      assert(
        Solution1.reverseList(ListNode(List(1, 2, 3, 4, 5))) === ListNode(
          List(5, 4, 3, 2, 1)
        )
      )
    }
  }
}
