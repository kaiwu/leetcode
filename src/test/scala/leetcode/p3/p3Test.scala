package leetcode
package p3

import utest._

object p3Test extends TestSuite {
  val tests = Tests {
    's1 - {
      assert(Solution1.lengthOfLongestSubstring("abcabcbb") == 3)
      assert(Solution1.lengthOfLongestSubstring("bbbbb") == 1)
      assert(Solution1.lengthOfLongestSubstring("pwwkew") == 3)
    }
  }
}
