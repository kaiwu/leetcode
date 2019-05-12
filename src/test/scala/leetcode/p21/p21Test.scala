package leetcode
package p21

import utest._

import leetcode.common.ListNode
import leetcode.common.ListNode._

object p21Test extends TestSuite {
  val tests = Tests {
    's1 - {
      val n1 = ListNode(List(1, 2, 4))
      val n2 = ListNode(List(1, 3, 4))
      val n3 = ListNode(List(1, 1, 2, 3, 4, 4))
      assert(Solution1.mergeTwoLists(n1, n2) === n3)
    }
  }
}
