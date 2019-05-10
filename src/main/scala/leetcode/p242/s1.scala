package leetcode
package p242

object Solution1 {
  def isSame(a1: Array[Int], a2: Array[Int]): Boolean =
    (0 until 26).forall(i => a1(i) == a2(i))

  def isAnagram(s: String, t: String): Boolean =
    if (s.length != t.length) false
    else {
      val a1 = Array.fill(26)(0)
      val a2 = Array.fill(26)(0)
      val (aa1, aa2) = (0 until s.length).foldLeft((a1, a2)) {
        case ((x1, x2), i) => {
          x1(s(i) - 'a') = x1(s(i) - 'a') + 1
          x2(t(i) - 'a') = x2(t(i) - 'a') + 1
          (x1, x2)
        }
      }
      isSame(aa1, aa2)
    }
}
