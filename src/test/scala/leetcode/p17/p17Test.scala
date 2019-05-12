package leetcode
package p17

import utest._
import leetcode.common.ListList._

object p17Test extends TestSuite {
  val tests = Tests {
    's1 - {
      assert(
        isEqual(
          Solution1.letterCombinations("23"),
          List("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")
        )
      )
    }
  }
}
