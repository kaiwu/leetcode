package leetcode
package p15

object Solution1 {
  val f0 = (m: Int, n: Int) => m + n
  val p0 = (m: Int) => m - 1
  val p1 = (m: Int) => m + 1
  val g0 = (m: Int) => m < 0
  val g1 = (m: Int) => m > 0

  def removeZeros(is: List[Int], n: Int): List[Int] = is match {
    case Nil                        => Nil
    case h :: t if h == 0 && n < 3  => h :: removeZeros(t, n + 1)
    case h :: t if h == 0 && n >= 3 => removeZeros(t, n)
    case h :: t                     => h :: removeZeros(t, n)
  }

  @annotation.tailrec
  def isZero(
      is: Array[Int],
      i: Int,
      f: Int => Int,
      p: Int => Int,
      g: Int => Boolean
  ): Option[Int] = {
    val x = f(is(i))
    if (g(x)) None
    else if (x == 0) Some(is(i))
    else isZero(is, p(i), f, p, g)
  }

  @annotation.tailrec
  def check(
      is: Array[Int],
      i: Int,
      j: Int,
      l: List[List[Int]]
  ): List[List[Int]] = {
    if (i >= is.length - 2) l
    else {
      val x = is(i) + is(j)
      val y =
        if (x <= 0) isZero(is, j - 1, f0(x, _), p0, g0)
        else isZero(is, i + 1, f0(x, _), p1, g1)

      val (n1, n2) = if (j - i > 2) (i, j - 1) else (i + 1, is.length - 1)
      if (y == None) check(is, n1, n2, l)
      else {
        val l1 = is(i) :: y.get :: is(j) :: Nil
        check(is, n1, n2, l1 :: l)
      }
    }
  }

  def threeSum(nums: Array[Int]): List[List[Int]] = {
    val sorted = removeZeros(nums.toList, 0).toArray.sortBy(identity)
    if (sorted.length < 3) Nil
    else check(sorted, 0, sorted.length - 1, Nil).distinct
  }
}
