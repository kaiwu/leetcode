package leetcode

/**
  * = Group Anagrams =
  * @see See [[https://leetcode.com/problems/group-anagrams/]]
  */
package object p49 {

  /**
    *
    */
  def isEqual(a: List[List[String]], b: List[List[String]]): Boolean = {
    val aa = a.map(ls => ls.sortBy(identity)).sortBy(ls => ls.mkString)
    val bb = b.map(ls => ls.sortBy(identity)).sortBy(ls => ls.mkString)
    aa == bb
  }
}
