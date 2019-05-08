package leetcode
package p27

object Solution1 {
  @annotation.tailrec
  def check(as: Array[Int], i: Int, j: Int, v: Int, c: Int): Int =
    if (j >= as.length) c
    else if (as(j) == v) check(as, i, j + 1, v, c)
    else {
      as(i) = as(j)
      check(as, i + 1, j + 1, v, c + 1)
    }

  def removeElement(nums: Array[Int], `val`: Int): Int =
    check(nums, 0, 0, `val`, 0)
}
