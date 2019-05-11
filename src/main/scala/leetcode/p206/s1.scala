package leetcode
package p206

import leetcode.common.ListNode

object Solution1 {
  @annotation.tailrec
  def next(n: ListNode, p: ListNode): ListNode =
    if (n == null) null
    else if (n.next == null) {
      n.next = p
      n
    } else {
      val nt = n.next
      n.next = p
      next(nt, n)
    }

  def reverseList(head: ListNode): ListNode = next(head, null)
}
