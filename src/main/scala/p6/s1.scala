package leetcode
package p6

object Solution1 {
  case class Zigchar(v: Char, r: Int, c: Int)

  /**
    * cycle 1: const c, r++  till R,
    * cycle 2: r--, c++ till r == 0
    */
  @annotation.tailrec
  def toZ(i: Int, x: Int, r: Int, c: Int, R: Int, cycle: Int): (Int, Int) =
    if (x == i) (r, c)
    else
      cycle match {
        case 1 if r < R  => toZ(i, x + 1, r + 1, c, R, 1)
        case 1 if r == R => toZ(i, x + 1, r - 1, c + 1, R, 2)
        case 2 if r > 0  => toZ(i, x + 1, r - 1, c + 1, R, 2)
        case 2 if r == 0 => toZ(i, x + 1, r + 1, c, R, 1)
      }

  def zig(s: List[Char], r: Int): List[Zigchar] = s.zipWithIndex.map {
    case (c, i) => {
      val (x, y) = toZ(i, 0, 0, 0, r, 1)
      Zigchar(c, x, y)
    }
  }

  def readByRow(zs: List[Zigchar]): String = {
    val sorted = zs.sortWith {
      case (x, y) if x.r < y.r  => true
      case (x, y) if x.r > y.r  => false
      case (x, y) if x.r == y.r => x.c < y.c
    }
    sorted.map(_.v).mkString
  }

  def convert(s: String, numRows: Int): String = {
    if (numRows == 1) s
    else readByRow(zig(s.toList, numRows - 1))
  }
}
