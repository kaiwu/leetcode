package leetcode
package p36

object Solution1 {
  def isValid(as: Array[Char]): Boolean =
    as.foldLeft(Array.fill(9)(0)) {
        case (a, c) if c != '.' => {
          a(c - '1') = a(c - '1') + 1
          a
        }
        case (a, c) if c == '.' => a
      }
      .forall(i => i < 2)

  def columns(board: Array[Array[Char]], c: Int): Array[Char] = board.map {
    case r => r(c)
  }

  def cubes(board: Array[Array[Char]], i: Int, j: Int): Array[Char] = {
    val cs = for {
      x <- i to i + 2
      y <- j to j + 2
    } yield board(x)(y)
    cs.toArray
  }

  def isValidSudoku(board: Array[Array[Char]]): Boolean = {
    val rows = for {
      i <- 0 to 8
    } yield board(i)

    val cols = (0 to 8).map(columns(board, _))

    val subs = for {
      i <- 0 to 6 by 3
      j <- 0 to 6 by 3
    } yield cubes(board, i, j)

    rows.forall(isValid) && cols.forall(isValid) && subs.forall(isValid)
  }
}
