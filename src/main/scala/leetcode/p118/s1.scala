package leetcode
package p118

object Solution1 {
  @annotation.tailrec
  def next(ls: List[Int], nl: List[Int] = List(1)): List[Int] = ls match {
    case Nil           => nl
    case h :: Nil      => next(Nil, 1 :: nl)
    case h1 :: h2 :: t => next(h2 :: t, h1 + h2 :: nl)
  }

  def generate(numRows: Int): List[List[Int]] = numRows match {
    case 0 => List.empty[List[Int]]
    case 1 => List(List(1))
    case 2 => List(List(1), List(1, 1))
    case x if x > 2 =>
      (1 until x - 1)
        .foldLeft(List(1, 1) :: List(1) :: Nil) {
          case (lls, i) => next(lls.head) :: lls
        }
        .reverse
  }
}
