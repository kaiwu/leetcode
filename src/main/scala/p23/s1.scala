package leetcode
package p23

object Solution1 {
  def smallest(ls: Array[ListNode]): Int = {
    val lls = ls.zipWithIndex.filter { case (n, i) => n != null }
    if (lls.isEmpty) 0
    else lls.minBy { case (n, i) => n.x }._2
  }

  @annotation.tailrec
  def next(ls: Array[ListNode],n: ListNode): ListNode = {
    val i = smallest(ls)
    if (ls(i) == null) n
    else {
      val node = ls(i)
      ls(i) = node.next
      node.next = n
      next(ls,node)
    }
  }

  def mergeKLists(lists: Array[ListNode]): ListNode = reverse(next(lists,null))
}
