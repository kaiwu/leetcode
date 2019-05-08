package leetcode
package p26

import utest._

object p26Test extends TestSuite {
  val tests = Tests {
    's1 - {
      val a1 = Array(1, 1, 2)
      val x1 = Solution1.removeDuplicates(a1)
      assert(x1 == 2)
      assert(a1(0) == 1 && a1(1) == 2)

      val a2 = Array(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
      val x2 = Solution1.removeDuplicates(a2)
      assert(x2 == 5)
      assert(a2(0) == 0 && a2(1) == 1 && a2(2) == 2 && a2(3) == 3 && a2(4) == 4)
    }
  }
}
