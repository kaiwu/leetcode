package leetcode
package common

object ListList {

  /**
    *
    */
  def isEqual[A: Ordering](a: List[List[A]], b: List[List[A]]): Boolean = {
    val aa = a.map(ls => ls.sortBy(identity)).sortBy(ls => ls.mkString)
    val bb = b.map(ls => ls.sortBy(identity)).sortBy(ls => ls.mkString)
    a.length == b.length && aa == bb
  }

  /**
    *
    */
  def isEqual(a: List[String], b: List[String]): Boolean =
    a.length == b.length &&
      a.sortBy(identity).mkString == b.sortBy(identity).mkString
}
