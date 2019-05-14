package leetcode
package p119

import utest._

object p119 extends TestSuite {
  val tests = Tests {
    's1 - {
      assert(Solution1.getRow(3) == List(1, 3, 3, 1))
      assert(Solution1.getRow(4) == List(1, 4, 6, 4, 1))
    }
  }
}
