package leetcode
package p118

import utest._

object p118 extends TestSuite {
  val tests = Tests {
    's1 - {
      assert(
        Solution1.generate(5) == List(
          List(1),
          List(1, 1),
          List(1, 2, 1),
          List(1, 3, 3, 1),
          List(1, 4, 6, 4, 1)
        )
      )
    }
  }
}
