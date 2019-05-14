package leetcode
package p387

import utest._

object p387Test extends TestSuite {
  val tests = Tests {
    's1 - {
      assert(Solution1.firstUniqChar("leetcode") == 0)
      assert(Solution1.firstUniqChar("loveleetcode") == 2)
    }
  }
}
