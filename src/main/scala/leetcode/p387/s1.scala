package leetcode
package p387

import scala.collection.mutable

object Solution1 {
  def firstUniqChar(s: String): Int = {
    val mm = mutable.Map[Char, List[(Char, Int)]]()
    val distincts = s.zipWithIndex
      .foldLeft(mm) {
        case (m, (c, i)) if m.contains(c) => {
          m(c) = (c, i) :: m(c)
          m
        }
        case (m, (c, i)) if !mm.contains(c) => {
          m(c) = (c, i) :: Nil
          m
        }
      }
      .filter {
        case (c, ls) => ls.length == 1
      }
    if (distincts.isEmpty) -1
    else
      distincts.toSeq
        .sortBy {
          case (c, h :: t) => h._2
          case (c, Nil)    => Int.MaxValue
        }
        .head
        ._2
        .head
        ._2
  }
}
