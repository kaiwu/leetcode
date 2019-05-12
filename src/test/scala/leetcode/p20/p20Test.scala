package leetcode
package p20

import utest._

object p20Test extends TestSuite {
  val tests = Tests {
    's1 - {
      assert(Solution1.isValid("()") == true)
      assert(Solution1.isValid("()[]{}") == true)
      assert(Solution1.isValid("(]") == false)
    }
  }
}
