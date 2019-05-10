package leetcode
package p5

import utest._

object p5Test extends TestSuite {
  val tests = Tests {
    's1 - {
      assert(Solution1.longestPalindrome("babad") == "bab")
      assert(Solution1.longestPalindrome("cbbd") == "bb")
    }
  }
}
