package leetcode
package p43

import utest._

object p43Test extends TestSuite {
  val tests = Tests {
    assert(Solution1.multiply("2", "3") == "6")
    assert(Solution1.multiply("123", "456") == "56088")
  }
}
