package leetcode
package p101

object Solution1 {
  def isMirror(t1: TreeNode, t2: TreeNode): Boolean = (t1, t2) match {
    case (null, null)           => true
    case (null, t) if t != null => false
    case (t, null) if t != null => false
    case (n1, n2) =>
      (n1.value == n2.value) &&
        isMirror(n1.left, n2.right) &&
        isMirror(n1.right, n2.left)
  }

  def isSymmetric(root: TreeNode): Boolean = isMirror(root, root)
}
