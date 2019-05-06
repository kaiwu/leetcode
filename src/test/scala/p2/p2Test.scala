package leetcode
package p2

import utest._

object p2Test extends TestSuite {
  val tests = Tests {
    's1 - {
      val n1 = listToListNode(List(2, 4, 3))
      val n2 = listToListNode(List(5, 6, 4))
      val n3 = listToListNode(List(7, 0, 8))
      val n4 = listToListNode(List(2, 7, 2, 1))
      assert(isEqual(n1, n1))
      assert(isEqual(Solution1.addTwoNumbers(n1, n2), n3))
      assert(isEqual(Solution1.addTwoNumbers(n2, n3), n4))
    }
  }
}