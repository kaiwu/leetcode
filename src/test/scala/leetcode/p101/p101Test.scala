package leetcode
package p101

import utest._

object p101Test extends TestSuite {
  val tests = Tests {
    's1 - {
      val t1 = TreeNode(List(1,2,2,3,4,4,3))
      val t2 = TreeNode(List(1,2,2,null,3,null,3))
      assert(Solution1.isSymmetric(t1) == true)
      assert(Solution1.isSymmetric(t2) == false)
    }
  }
}
