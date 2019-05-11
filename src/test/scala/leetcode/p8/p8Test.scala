package leetcode
package p8

import utest._
import leetcode.common.ListNode

object p8Test extends TestSuite {
  val tests = Tests {
    's1 - {
      assert(Solution1.myAtoi("42") == 42)
      assert(Solution1.myAtoi("-42") == -42)
      assert(Solution1.myAtoi("4193 with words") == 4193)
      assert(Solution1.myAtoi("words and 987") == 0)
      assert(Solution1.myAtoi("-91283472332") == Int.MinValue)
    }
  }
}