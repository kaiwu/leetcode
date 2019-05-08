package leetcode
package p23

object Solution1 {
  def smallest(ls: Array[ListNode]): Int = {
    val lls = ls.zipWithIndex.filter { case (n, i) => n != null }
    if (lls.isEmpty) 0
    else lls.minBy { case (n, i) => n.x }._2
  }

  @annotation.tailrec
  def next(ls: Array[ListNode], n: ListNode): ListNode = {
    val i = smallest(ls)
    if (ls.isEmpty || ls(i) == null) n
    else {
      val node = ls(i)
      ls(i) = node.next
      val nn = new ListNode(node.x)
      nn.next = n
      next(ls, nn)
    }
  }

  def mergeKLists(lists: Array[ListNode]): ListNode = next(lists, null).reverse
}
