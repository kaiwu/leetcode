package leetcode
package p31

import utest._

object p31Test extends TestSuite {
  val tests = Tests {
    's1 - {
      val a1 = Array(1, 2, 3)
      Solution1.nextPermutation(a1)
      assert(a1.deep == Array(1, 3, 2).deep)
      val a2 = Array(3, 2, 1)
      Solution1.nextPermutation(a2)
      assert(a2.deep == Array(1, 2, 3).deep)
      val a3 = Array(1, 1, 5)
      Solution1.nextPermutation(a3)
      assert(a3.deep == Array(1, 5, 1).deep)
      val a4 = Array(1, 3, 2)
      Solution1.nextPermutation(a4)
      assert(a4.deep == Array(2, 1, 3).deep)
      val a5 = Array(2, 3, 1)
      Solution1.nextPermutation(a5)
      assert(a5.deep == Array(3, 1, 2).deep)
    }
  }
}
