package leetcode
package p204

/** Solution from hint
  *
  */
object Solution1 {
  @annotation.tailrec
  def setNonPrime(ns: Array[Boolean], i: Int, n: Int): Unit = {
    if (i * i >= n) ()
    else if (ns(i) == false) setNonPrime(ns, i + 1, n)
    else {
      (i * i until n by i).foreach {
        case x => ns(x) = false
      }
      setNonPrime(ns, i + 1, n)
    }
  }
  def countPrimes(n: Int): Int = {
    val nums = Array.fill(n)(true)
    setNonPrime(nums, 2, n)
    if (n < 2) 0 else nums.count(identity) - 2
  }
}
