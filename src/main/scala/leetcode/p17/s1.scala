package leetcode
package p17

object Solution1 {
  def mapping(c: Char): String = c match {
    case '2' => "abc"
    case '3' => "def"
    case '4' => "ghi"
    case '5' => "jkl"
    case '6' => "mno"
    case '7' => "pqrs"
    case '8' => "tuv"
    case '9' => "wxyz"
    case _   => ""
  }

  def next(as: List[(Int, Int)]): List[(Int, Int)] = as match {
    case Nil                        => Nil
    case h :: t if h._1 < h._2 - 1  => (h._1 + 1, h._2) :: t
    case h :: t if h._1 == h._2 - 1 => (0, h._2) :: next(t)
  }

  def comb(
      x: List[String],
      y: List[(Int, Int)],
      l: List[String],
      q: Boolean
  ): List[String] =
    if (q) l
    else {
      val s = (x zip y.map(_._1)).map {
        case (s, i) => s(i)
      }
      comb(x, next(y), s.mkString :: l, y.map(_._1 + 1) == x.map(_.length))
    }

  def letterCombinations(digits: String): List[String] = {
    val ds = digits.map(mapping).toList
    val ls = List.fill(ds.length)(0) zip ds.map(_.length)
    if (digits.isEmpty) Nil
    else comb(ds, ls, Nil, false)
  }
}
