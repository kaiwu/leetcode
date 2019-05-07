package leetcode
package p6

import utest._

object p6Test extends TestSuite {
  val tests = Tests {
    's1 - {
      assert(Solution1.convert("PAYPALISHIRING", 3) == "PAHNAPLSIIGYIR")
      assert(Solution1.convert("PAYPALISHIRING", 4) == "PINALSIGYAHRPI")
    }
  }
}
