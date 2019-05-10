package leetcode
package p234

import utest._
import leetcode.common.ListNode

object p234Test extends TestSuite {
  val tests = Tests {
    's1 - {
      assert(Solution1.isPalindrome(ListNode(List(1,2))) == false)
      assert(Solution1.isPalindrome(ListNode(List(1,2,2,1))) == true)
    }
  }
}