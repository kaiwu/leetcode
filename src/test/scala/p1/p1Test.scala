package leetcode
package p1

import utest._

object p1Test extends TestSuite {
  val tests = Tests {
    's1 - {
      assert(Solution1.twoSum(Array(2, 7, 11, 15), 9).deep == Array(0, 1).deep)
      assert(Solution1.twoSum(Array(2, 7, 11, 15), 13).deep == Array(0, 2).deep)
      assert(Solution1.twoSum(Array(2, 7, 11, 15), 33).deep == Array().deep)
    }
    's2 - {
      assert(Solution2.twoSum(Array(2, 7, 11, 15), 9).deep == Array(0, 1).deep)
      assert(Solution2.twoSum(Array(2, 7, 11, 15), 13).deep == Array(0, 2).deep)
      assert(Solution2.twoSum(Array(2, 7, 11, 15), 33).deep == Array().deep)
    }
  }
}
