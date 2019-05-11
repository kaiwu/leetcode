package leetcode
package p9

import utest._
import leetcode.common.ListNode

object p9Test extends TestSuite {
  val tests = Tests {
    's1 - {
      assert(Solution1.isPalindrome(121) == true)
      assert(Solution1.isPalindrome(1221) == true)
      assert(Solution1.isPalindrome(-121) == false)
      assert(Solution1.isPalindrome(10) == false)
    }
  }
}
