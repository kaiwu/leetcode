package leetcode
package p13

import utest._

object p13Test extends TestSuite {
  val tests = Tests {
    's1 - {
      assert(Solution1.romanToInt("III") == 3)
      assert(Solution1.romanToInt("IV") == 4)
      assert(Solution1.romanToInt("IX") == 9)
      assert(Solution1.romanToInt("LVIII") == 58)
      assert(Solution1.romanToInt("MCMXCIV") == 1994)
    }
  }
}
