package leetcode
package p234

import leetcode.common.ListNode

object Solution1 {
  @annotation.tailrec
  def toList(ln: ListNode, l: List[Int]): List[Int] =
    if (ln == null) l
    else toList(ln.next, ln.x :: l)

  @annotation.tailrec
  def isPalindrome(ls: List[Int], ln: ListNode): Boolean = ls match {
    case Nil => true
    case h :: t =>
      if (h == ln.x) isPalindrome(t, ln.next)
      else false
  }

  def isPalindrome(head: ListNode): Boolean = {
    val ls = toList(head, List.empty[Int])
    isPalindrome(ls, head)
  }
}
