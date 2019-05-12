package leetcode
package p15

import utest._
import leetcode.common.ListList._

object p15Test extends TestSuite {
  val tests = Tests {
    's1 - {
      assert(
        isEqual(
          Solution1.threeSum(Array(-1, 0, 1, 2, -1, -4)),
          List(List(-1, 0, 1), List(-1, -1, 2))
        )
      )
    }
  }
}
