package leetcode
package p66

object Solution1 {
  def add(x: Int, d: Int): List[Int] =
    if (x + d > 9) List(1, 0)
    else List(0, x + d)

  def plusOne(digits: Array[Int]): Array[Int] = {
    digits.reverse
      .foldLeft(List[Int]()) {
        case (ls, i) =>
          ls match {
            case h :: t => {
              val added = add(i, h)
              added ++ t
            }
            case Nil => add(i, 1)
          }
      }
      .dropWhile(_ == 0)
      .toArray
  }
}
