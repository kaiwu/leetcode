package leetcode
package p89

import utest._

object p89 extends TestSuite {
  val tests = Tests {
    's1 - {
      assert(Solution1.grayCode(2) == List(0, 1, 3, 2))
      assert(Solution1.grayCode(3) == List(0, 1, 3, 2, 6, 7, 5, 4))
    }
  }
}
