package leetcode
package p12

import utest._

object p12Test extends TestSuite {
  val tests = Tests {
    's1 - {
      assert(Solution1.intToRoman(3) == "III")
      assert(Solution1.intToRoman(4) == "IV")
      assert(Solution1.intToRoman(9) == "IX")
      assert(Solution1.intToRoman(58) == "LVIII")
      assert(Solution1.intToRoman(1994) == "MCMXCIV")
    }
  }
}
