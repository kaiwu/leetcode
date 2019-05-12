package leetcode
package p24

import leetcode.common.ListNode

object Solution1 {
  def swapPairs(head: ListNode): ListNode = {
    if (head == null) null
    else if (head.next == null) head
    else {
      val b = head.next
      head.next = swapPairs(head.next.next)
      b.next = head
      b
    }
  }
}
