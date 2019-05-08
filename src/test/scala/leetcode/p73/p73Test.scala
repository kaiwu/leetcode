package leetcode
package p73

import utest._

object p73Test extends TestSuite {
  val tests = Tests {
    's1 - {
      val a1 = Array(Array(1, 1, 1), Array(1, 0, 1), Array(1, 1, 1))
      val a2 = Array(Array(1, 0, 1), Array(0, 0, 0), Array(1, 0, 1))
      Solution1.setZeroes(a1)
      assert(a1.deep == a2.deep)

      val a3 = Array(Array(0, 1, 2, 0), Array(3, 4, 5, 2), Array(1, 3, 1, 5))
      val a4 = Array(Array(0, 0, 0, 0), Array(0, 4, 5, 0), Array(0, 3, 1, 0))
      Solution1.setZeroes(a3)
      assert(a3.deep == a4.deep)
    }
  }
}
