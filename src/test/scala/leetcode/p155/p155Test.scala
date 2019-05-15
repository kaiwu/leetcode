package leetcode
package p155

import utest._

object p155Test extends TestSuite {
  val tests = Tests {
    's1 - {
      val s = new MinStack
      s.push(-2)
      s.push(0)
      s.push(-3)
      assert(s.getMin() == -3)
      s.pop()
      assert(s.top() == 0)
      assert(s.getMin() == -2)
    }
  }
}
