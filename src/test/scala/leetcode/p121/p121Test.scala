package leetcode
package p121

import utest._

object p11Test extends TestSuite {
  val tests = Tests {
    's1 - {
      assert(Solution1.maxProfit(Array(7, 1, 5, 3, 6, 4)) == 5)
      assert(Solution1.maxProfit(Array(7, 6, 4, 3, 1)) == 0)
    }
  }
}
