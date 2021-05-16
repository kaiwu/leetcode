package leetcode
package p46

object Solution1 {
  def cal(ns: Array[Int],l: List[List[Int]]): List[List[Int]] = {
    if (ns.length == 2) List(ns(0),ns(1))::List(ns(1),ns(0))::Nil
    else {
      Nil
    }
  }

  def permute(nums: Array[Int]): List[List[Int]] = {
    Nil
  }
}