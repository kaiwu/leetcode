package leetcode
package p16

import utest._

object p16Test extends TestSuite {
  val tests = Tests {
    's1 - {
      assert(Solution1.threeSumClosest(Array(-1, 2, 1, -4), 1) == 2)
    }
  }
}
