package leetcode
package p78

import utest._
import leetcode.common.ListList._

object p78Test extends TestSuite {
  val tests = Tests {
    's1 - {
      val ls = List(
        List(3),
        List(1),
        List(2),
        List(1, 2, 3),
        List(1, 3),
        List(2, 3),
        List(1, 2),
        List()
      )
      assert(isEqual(Solution1.subsets(Array(1, 2, 3)), ls))
    }
  }
}
