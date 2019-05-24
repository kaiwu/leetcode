package leetcode
package p31

/** One pass
  *
  */
object Solution1 {
  @annotation.tailrec
  def reverse(ns: Array[Int], i: Int, j: Int): Unit = {
    if (i >= j) ()
    else {
      val t = ns(i)
      ns(i) = ns(j)
      ns(j) = t
      reverse(ns,i+1,j-1)
    }
  }

  @annotation.tailrec
  def swap(ns:Array[Int], i: Int, j: Int) : Unit =
   if (j < 0) ()
   else if (ns(j) <= ns(i)) swap(ns,i,j-1)
   else {
     val t = ns(i)
     ns(i) = ns(j)
     ns(j) = t
   }

  @annotation.tailrec
  def check(ns: Array[Int], i: Int, j: Int): Unit =
    if (i < 0) reverse(ns,0,ns.length - 1)
    else if (ns(i) >= ns(j)) check(ns,i-1,j-1)
    else {
      swap(ns,i,ns.length - 1)
      reverse(ns,i+1,ns.length - 1)
    }

  def nextPermutation(nums: Array[Int]): Unit =
    if (nums.length < 2) ()
    else check(nums, nums.length - 2, nums.length - 1)
}
