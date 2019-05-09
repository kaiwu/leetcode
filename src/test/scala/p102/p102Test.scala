package leetcode
package p102

import utest._

object p102Test extends TestSuite {
  val tests = Tests {
    's1 - {
      val t1 = TreeNode(List(3, 9, 20, null, null, 15, 7))
      assert(
        Solution1.levelOrder(t1) == List(List(3), List(9, 20), List(15, 7))
      )
    }
  }
}
