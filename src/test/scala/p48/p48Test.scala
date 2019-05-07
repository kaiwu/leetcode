package leetcode
package p48

import utest._

object p48Test extends TestSuite {
  val tests = Tests {
    's1 - {
      val m1 = Array(Array(1, 2, 3), Array(4, 5, 6), Array(7, 8, 9))
      val m2 = Array(Array(7, 4, 1), Array(8, 5, 2), Array(9, 6, 3))
      Solution1.rotate(m1)
      assert(m1.deep == m2.deep)

      val m3 = Array(
        Array(5, 1, 9, 11),
        Array(2, 4, 8, 10),
        Array(13, 3, 6, 7),
        Array(15, 14, 12, 16)
      )
      val m4 = Array(
        Array(15, 13, 2, 5),
        Array(14, 3, 4, 1),
        Array(12, 6, 8, 9),
        Array(16, 7, 10, 11)
      )
      Solution1.rotate(m3)
      assert(m3.deep == m4.deep)
    }
  }
}
