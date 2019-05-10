package leetcode
package p102

import TreeNode._

object Solution1 {
  def merge(
      m1: Map[Int, List[Int]],
      m2: Map[Int, List[Int]]
  ): Map[Int, List[Int]] =
    (m1.toSeq ++ m2.toSeq)
      .groupBy {
        case (k, ls) => k
      }
      .toSeq
      .sortBy {
        case (k, ls) => k
      }
      .map {
        case (k, ls) => (k, ls.map(_._2).flatten.toList)
      }
      .toMap

  def levelOrder(root: TreeNode): List[List[Int]] = {
    val m = Map.empty[Int, List[Int]]
    val f = (l: Int, n: TreeNode) =>
      if (n == null) Map.empty[Int, List[Int]]
      else Map[Int, List[Int]](l -> List(n.value))

    foldBFS(root, m)(f)(merge).map {
      case (k, v) => v
    }.toList
  }
}
