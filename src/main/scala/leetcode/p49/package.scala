package leetcode

import Tags._

/** =Group Anagrams=
  *
  * @see [[https://leetcode.com/problems/group-anagrams/ leetcode]]
  * @see [[p242 Valid Anagram]]
  * @see [[p249 Group Shifted Strings]]
  */
package object p49 {
  trait p49
      extends Medium
      with Amazon
      with Uber
      with Facebook
      with Apple
      with Yahoo
      with Microsoft
      with Google
      with Yandex
      with Yelp
      with EBay
      with Bloomberg
      with Adobe
      with Visa
      with TopicHashTable
      with TopicString

  /**
    *
    */
  def isEqual(a: List[List[String]], b: List[List[String]]): Boolean = {
    val aa = a.map(ls => ls.sortBy(identity)).sortBy(ls => ls.mkString)
    val bb = b.map(ls => ls.sortBy(identity)).sortBy(ls => ls.mkString)
    aa == bb
  }
}
