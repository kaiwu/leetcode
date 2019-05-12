package leetcode
package p14

import utest._

object p14Test extends TestSuite {
  val tests = Tests {
    's1 - {
      assert(
        Solution1.longestCommonPrefix(Array("flower", "flow", "flight")) == "fl"
      )
      assert(
        Solution1.longestCommonPrefix(Array("dog", "racecar", "car")) == ""
      )
    }
  }
}
