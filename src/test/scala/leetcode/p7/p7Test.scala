package leetcode
package p7

import utest._

object p7Test extends TestSuite {
  val tests = Tests {
    's1 - {
      assert(Solution1.reverse(123) == 321)
      assert(Solution1.reverse(-123) == -321)
      assert(Solution1.reverse(120) == 21)
    }
  }
}
