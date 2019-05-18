package leetcode
package p204

import utest._

object p204Test extends TestSuite {
  val tests = Tests {
    's1 - {
      assert(Solution1.countPrimes(10) == 4)
      assert(Solution1.countPrimes(11) == 4)
      assert(Solution1.countPrimes(12) == 5)
    }
  }
}
