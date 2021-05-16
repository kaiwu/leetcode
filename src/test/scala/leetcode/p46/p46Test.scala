package leetcode
package p46

import utest._
import common.ListList

object p46Test extends TestSuite {
  val tests = Tests {
    assert(ListList.isEqual(Solution1.permute(Array(1,2,3)),List()))
  }
}