package leetcode
package p2

object Solution1 {
  def add(x: Int, y: Int, z: Int): (Int, Int) =
    if (x + y + z >= 10) (1, x + y + z - 10)
    else (0, x + y + z)

  def nextNode(l1: ListNode, l2: ListNode, s: Int): ListNode = (l1, l2) match {
    case (null, null) => if (s > 0) new ListNode(s) else null
    case (null, n) if n != null => {
      val (a, b) = add(0, n.x, s)
      val x = new ListNode(b)
      x.next = nextNode(null, n.next, a)
      x
    }
    case (n, null) if n != null => {
      val (a, b) = add(n.x, 0, s)
      val x = new ListNode(b)
      x.next = nextNode(n.next, null, a)
      x
    }
    case (n1, n2) if n1 != null && n2 != null => {
      val (a, b) = add(n1.x, n2.x, s)
      val x = new ListNode(b)
      x.next = nextNode(n1.next, n2.next, a)
      x
    }
  }

  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = nextNode(l1, l2, 0)
}
