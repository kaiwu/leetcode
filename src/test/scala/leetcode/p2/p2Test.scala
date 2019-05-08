package leetcode
package p2

import utest._
import ListNode._

object p2Test extends TestSuite {
  val tests = Tests {
    's1 - {
      val n1 = ListNode(List(2, 4, 3))
      val n2 = ListNode(List(5, 6, 4))
      val n3 = ListNode(List(7, 0, 8))
      val n4 = ListNode(List(2, 7, 2, 1))
      assert(n1 === n1)
      assert(Solution1.addTwoNumbers(n1, n2) === n3)
      assert(Solution1.addTwoNumbers(n2, n3) === n4)
    }
  }
}