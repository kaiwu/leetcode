package leetcode
package common

class ListNode(var _x: Int = 0) {
  var next: ListNode = null
  var x: Int = _x
}

object ListNode {

  /**
    *
    */
  def apply(ls: List[Int]): ListNode = ls match {
    case Nil => null
    case h :: t => {
      val n = new ListNode(h)
      n.next = apply(t)
      n
    }
  }

  /**
    *
    */
  @annotation.tailrec
  def isEqual(n1: ListNode, n2: ListNode): Boolean = (n1, n2) match {
    case (null, null) => true
    case (ln1, ln2) if ln1 != null && ln2 != null =>
      if (ln1.x == ln2.x) isEqual(ln1.next, ln2.next)
      else false
    case _ => false
  }

  /**
    *
    */
  @annotation.tailrec
  def show(n: ListNode, s: String = ""): String =
    if (n == null) s + "null"
    else show(n.next, s + s"${n.x} -> ")

  @annotation.tailrec
  def reverse(ls: ListNode, p: ListNode = null): ListNode =
    if (ls != null) {
      val n = ls.next
      ls.next = p
      reverse(n, ls)
    } else p

  implicit class ListNodeOps(n: ListNode) {
    def `===`(ln: ListNode): Boolean = isEqual(n, ln)
    override def toString(): String = show(n)
    def reverse: ListNode = ListNode.reverse(n)
  }
}
