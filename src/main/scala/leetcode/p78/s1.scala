package leetcode
package p78

object Solution1 {
  def sets(nums: Array[Int], i: Int): List[List[Int]] = {
    if (i == 0) List(List(nums(i)), Nil)
    else {
      val lls = sets(nums, i - 1)
      lls ++ lls.map(ls => nums(i) :: ls)
    }
  }

  def subsets(nums: Array[Int]): List[List[Int]] = sets(nums, nums.length - 1)
}
