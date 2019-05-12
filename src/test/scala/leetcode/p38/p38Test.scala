package leetcode
package p38

import utest._

object p38Test extends TestSuite {
  val tests = Tests {
    's1 - {
      assert(Solution1.countAndSay(1) == "1")
      assert(Solution1.countAndSay(4) == "1211")
    }
  }
}
