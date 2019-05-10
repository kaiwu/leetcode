package leetcode
package p242

import utest._

object p242Test extends TestSuite {
  val tests = Tests {
    's1 - {
      assert(Solution1.isAnagram("anagram","nagaram") == true)
      assert(Solution1.isAnagram("rat","car") == false)
    }
  }
}
