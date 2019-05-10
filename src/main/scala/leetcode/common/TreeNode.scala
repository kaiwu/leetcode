package leetcode
package common

class TreeNode(var _value: Int) {
  var value: Int = _value
  var left: TreeNode = null
  var right: TreeNode = null
}

object TreeNode {
  def add(ns: Array[TreeNode], x: Int): TreeNode = {
    val s = ns.length
    if (s == 0) null
    else if (ns(x) == null) add(ns, x + 1)
    else {
      val l = x * 2 + 1
      val r = x * 2 + 2
      ns(x).left = if (l < s) ns(l) else null
      ns(x).right = if (r < s) ns(r) else null
      if (l >= s) ns(0)
      else add(ns, x + 1)
    }
  }

  def apply(ls: List[Any]): TreeNode = {
    val ns = ls.map {
      case i if i == null => null
      case i if i != null => new TreeNode(i.asInstanceOf[Int])
    }.toArray
    add(ns, 0)
  }

  /**
    * @note stack unsafe
    */
  def foldDFS[A](n: TreeNode)(f: TreeNode => A)(g: (A, A) => A): A = {
    if (n == null) f(n)
    else {
      lazy val l = foldDFS(n.left)(f)(g)
      lazy val r = foldDFS(n.right)(f)(g)

      g(f(n), g(l, r)) // PostOrder Left-Right-Root
      // g(g(f(n),l),r) // PreOrder Root-Left-Right
      // g(l,g(f(n),r)) // InOrder  Left-Root-Right
    }
  }

  import scala.collection.immutable.Queue
  @annotation.tailrec
  def flatten(
      q: Queue[(Int, TreeNode)],
      ls: List[(Int, TreeNode)] = Nil
  ): List[(Int, TreeNode)] = {
    if (q.isEmpty) ls
    else {
      val (n, t) = q.dequeue
      (n._2.left, n._2.right) match {
        case (null, null) => flatten(t, n :: ls)
        case (l, null) if l != null =>
          flatten(t :+ (n._1 + 1, l), n :: ls)
        case (null, r) if r != null =>
          flatten(t :+ (n._1 + 1, r), n :: ls)
        case (l, r) => flatten(t :+ (n._1 + 1, l) :+ (n._1 + 1, r), n :: ls)
      }
    }
  }

  def foldBFS[A](
      n: TreeNode,
      a: A
  )(f: (Int, TreeNode) => A)(g: (A, A) => A): A = {
    val ns = flatten(Queue((0, n))).reverse
    ns.foldLeft(a) {
      case (a1, nn) => g(a1, f.tupled(nn))
    }
  }
}
