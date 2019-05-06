package leetcode

/**
  * = Add Two Numbers =
  * @see See [[https://leetcode.com/problems/add-two-numbers/]]
  */
package object p2 {
  class ListNode(var _x: Int = 0) {
    var next: ListNode = null
    var x: Int = _x
  }

  /**
    *
    */
  def listToListNode(ls: List[Int]): ListNode = ls match {
    case Nil => null
    case h :: t => {
      val n = new ListNode(h)
      n.next = listToListNode(t)
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
}
