package leetcode
package p27

import utest._

object p27Test extends TestSuite {
  val tests = Tests {
    's1 - {
      val a1 = Array(3, 2, 2, 3)
      val x1 = Solution1.removeElement(a1, 3)
      assert(x1 == 2)
      assert(a1(0) == 2 && a1(1) == 2)

      val a2 = Array(0, 1, 2, 2, 3, 0, 4, 2)
      val x2 = Solution1.removeElement(a2, 2)
      assert(x2 == 5)
      assert(a2(0) == 0 && a2(1) == 1 && a2(2) == 3 && a2(3) == 0 && a2(4) == 4)
    }
  }
}
