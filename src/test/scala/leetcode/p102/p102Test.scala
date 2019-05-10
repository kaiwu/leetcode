package leetcode
package p102

import utest._
import leetcode.common.TreeNode

object p102Test extends TestSuite {
  val tests = Tests {
    's1a - {
      val t1 = TreeNode(List(3, 9, 20, null, null, 15, 7))
      assert(
        Solution1.levelOrder(t1) == List(List(3), List(9, 20), List(15, 7))
      )
    }
    's1b - {
      val t2 = TreeNode(
        List(
          5,
          0,
          -4,
          -1,
          -6,
          -9,
          null,
          7,
          null,
          1,
          3,
          null,
          0,
          null,
          9,
          null,
          null,
          6,
          0,
          null,
          -7,
          null,
          null,
          null,
          null,
          null,
          null,
          -4,
          null,
          1,
          null,
          null,
          -4
        )
      )
      assert(
        Solution1.levelOrder(t2) == List(
          List(5),
          List(0, -4),
          List(-1, -6, -9),
          List(7, 1, 3, 0),
          List(9, 6, 0, -7),
          List(-4),
          List(1),
          List(-4)
        )
      )
    }
  }
}
