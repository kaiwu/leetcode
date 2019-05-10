package leetcode
package p23

import utest._
import leetcode.common.ListNode

object p23Test extends TestSuite {
  val tests = Tests {
    's1 - {
      val n1 = ListNode(List(1, 2, 3))
      val n2 = ListNode(List(1, 4, 7))
      val n3 = ListNode(List(5, 6, 9))

      val n4 = ListNode(List(1, 1, 2, 3, 4, 7))
      assert(Solution1.mergeKLists(Array(n1, n2)) === n4)

      val n5 = ListNode(List(1, 1, 2, 3, 4, 5, 6, 7, 9))
      assert(Solution1.mergeKLists(Array(n1, n2, n3)) === n5)

      val n6 = ListNode(List.empty[Int])
      val n7 = ListNode(List.empty[Int])
      assert(Solution1.mergeKLists(Array(n6, n7)) === n6)
    }
  }
}
