package leetcode
package p21

import leetcode.common.ListNode

object Solution1 {
  def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode = (l1, l2) match {
    case (null, null)                     => null
    case (a, b) if a != null && b == null => a
    case (a, b) if a == null && b != null => b
    case (a, b) if a != null && b != null => {
      val d = a._x - b._x
      if (d <= 0) {
        a.next = mergeTwoLists(a.next, b)
        a
      } else {
        b.next = mergeTwoLists(a, b.next)
        b
      }
    }
  }
}
