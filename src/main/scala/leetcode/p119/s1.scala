package leetcode
package p119

object Solution1 {
  @annotation.tailrec
  def next(ls: List[Int], nl: List[Int] = List(1)): List[Int] = ls match {
    case Nil           => nl
    case h :: Nil      => next(Nil, 1 :: nl)
    case h1 :: h2 :: t => next(h2 :: t, h1 + h2 :: nl)
  }

  def getRow(rowIndex: Int): List[Int] = rowIndex match {
    case 0          => List(1)
    case 1          => List(1, 1)
    case x if x > 1 => next(getRow(x - 1))
  }
}
