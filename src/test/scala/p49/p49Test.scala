package leetcode
package p49

import utest._

object p49Test extends TestSuite {
  val tests = Tests {
    's1 - {
      val a1 = Array("eat", "tea", "tan", "ate", "nat", "bat")
      val a2 =
        List(List("ate", "eat", "tea"), List("nat", "tan"), List("bat"))
      assert(isEqual(Solution1.groupAnagrams(a1),a2))
    }
  }
}
