package leetcode
package p58

import utest._

object p58Test extends TestSuite {
  val tests = Tests {
    's1 - {
      assert(
        Solution1.lengthOfLastWord("hello world") == 5
      )
    }
  }
}
