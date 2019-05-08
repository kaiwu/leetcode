package leetcode
package p49

object Solution1 {
  def sig(s: String): (String, Array[Int]) = {
    val as = Array.fill(26)(0)
    (s, s.foldLeft(as) {
      case (a, c) => {
        val n = c - 'a'
        a(n) = a(n) + 1
        a
      }
    })
  }
  def groupAnagrams(strs: Array[String]): List[List[String]] = {
    val sigs = strs.map(sig)
    sigs
      .groupBy {
        case (s, as) => as.deep
      }
      .map {
        case (k, v) => v.map { case (x, ai) => x }.toList
      }
      .toList
  }
}
