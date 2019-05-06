package leetcode
package p1

import utest._

object s1Test extends TestSuite {
  val tests = Tests {
    'sample - {
      assert(Solution1.twoSum(Array(2, 7, 11, 15), 9).deep == Array(0, 1).deep)
      assert(Solution1.twoSum(Array(2, 7, 11, 15), 13).deep == Array(0, 2).deep)
    }
  }
}
