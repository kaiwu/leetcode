package leetcode
package p66

import utest._

object p66Test extends TestSuite {
  val tests = Tests {
    's1 - {
      assert(Solution1.plusOne(Array(1, 2, 3)).deep == Array(1, 2, 4).deep)
      assert(
        Solution1.plusOne(Array(4, 3, 2, 1)).deep == Array(4, 3, 2, 2).deep
      )
    }
  }
}
