package leetcode
package p43

object Solution1 {
  def charMultiply(c: Char, s: String): String = {
    val (r, z) = s.reverse.foldLeft(("", 0)) {
      case ((ss, i), cc) => {
        val x = cc - '0'
        val y = c - '0'
        val m = x * y + i
        val t = m / 10
        val v = m - 10 * t
        (s"$v" + ss, t)
      }
    }
    if (z > 0) s"$z" + r else r
  }

  @annotation.tailrec
  def addString(s1: String, s2: String, ss: String = "", x: Int = 0): String =
    (s1.reverse.toList, s2.reverse.toList) match {
      case (Nil, Nil) => if (x > 0) s"$x" + ss else ss
      case (h1 :: t1, Nil) => {
        val v1 = h1 - '0'
        val sum = v1 + x
        val (s, y) = if (sum >= 10) (sum - 10, 1) else (sum, 0)
        addString(t1.reverse.mkString, s2, s"$s" + ss, y)
      }
      case (Nil, h2 :: t2) => {
        val v2 = h2 - '0'
        val sum = v2 + x
        val (s, y) = if (sum >= 10) (sum - 10, 1) else (sum, 0)
        addString(s1, t2.reverse.mkString, s"$s" + ss, y)
      }
      case (h1 :: t1, h2 :: t2) => {
        val v1 = h1 - '0'
        val v2 = h2 - '0'
        val sum = v1 + v2 + x
        val (s, y) = if (sum >= 10) (sum - 10, 1) else (sum, 0)
        addString(t1.reverse.mkString, t2.reverse.mkString, s"$s" + ss, y)
      }
    }

  def multiply(num1: String, num2: String): String = {
    if (num1 == "0" || num2 == "0") "0"
    else {
      val ns = num1.reverse.toList.map(charMultiply(_, num2))
      ns.foldLeft(("", "")) {
          case ((s1, s2), s3) => {
            val x = addString(s3 + s2, s1)
            (x, "0" + s2)
          }
        }
        ._1
    }
  }
}
