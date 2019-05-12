package leetcode
package p67

import utest._

object p67Test extends TestSuite {
  val tests = Tests {
    's1 - {
      assert(Solution1.addBinary("11","1") == "100")
      assert(Solution1.addBinary("1010","1011") == "10101")
    }
  }
}
