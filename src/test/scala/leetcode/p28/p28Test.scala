package leetcode
package p28

import utest._

object p28Test extends TestSuite {
  val tests = Tests {
    's1 - {
      assert(Solution1.strStr("hello", "ll") == 2)
      assert(Solution1.strStr("aaaaa", "bba") == -1)
    }
  }
}
