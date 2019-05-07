package leetcode
package p23

import utest._

object p23Test extends TestSuite {
  val tests = Tests {
    's1 - {
      val n1 = listToListNode(List(1, 2, 3))
      val n2 = listToListNode(List(1, 4, 7))
      val n3 = listToListNode(List(5, 6, 9))

      val n4 = listToListNode(List(1, 1, 2, 3, 4, 7))
      assert(isEqual(Solution1.mergeKLists(Array(n1, n2)), n4))

      val n5 = listToListNode(List(1, 1, 2, 3, 4, 5, 6, 7, 9))
      assert(isEqual(Solution1.mergeKLists(Array(n1, n2, n3)), n5))

      val n6 = listToListNode(List.empty[Int])
      val n7 = listToListNode(List.empty[Int])
      assert(isEqual(Solution1.mergeKLists(Array(n6, n7)), n6))
    }
  }
}
