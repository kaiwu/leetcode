package leetcode
package p48

object Solution1 {
  def colum(m: Array[Array[Int]], c: Int): Array[Int] = {
    val s = m.length
    (s - 1 to 0 by -1).map {
      case i => m(i)(c)
    }.toArray
  }

  def rotate(matrix: Array[Array[Int]]): Unit = {
    val s = matrix.length
    val m = matrix.clone
    (0 until s).foreach {
      case i => matrix(i) = colum(m, i)
    }
  }
}
