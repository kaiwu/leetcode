package leetcode
package p67

object Solution1 {
  def addChar(c1: Char, c2: Char, c3: Char): String = (c1, c2, c3) match {
    case ('1', '1', '1') => "11"
    case ('0', '0', '0') => "00"
    case ('1', '0', '1') => "10"
    case ('1', '1', '0') => "10"
    case ('0', '1', '1') => "10"
    case _               => "01"
  }

  @annotation.tailrec
  def add(l1: List[Char], l2: List[Char], s: String): String = (l1, l2) match {
    case (Nil, Nil)           => s
    case (h1 :: t1, Nil)      => add(t1, l2, addChar(h1, s(0), '0') + s.tail)
    case (Nil, h2 :: t2)      => add(l1, t2, addChar(h2, s(0), '0') + s.tail)
    case (h1 :: t1, h2 :: t2) => add(t1, t2, addChar(h1, h2, s(0)) + s.tail)
  }

  def addBinary(a: String, b: String): String = {
    val s = add(a.reverse.toList, b.reverse.toList, "0").dropWhile(_ == '0')
    if (s.isEmpty) "0"
    else s
  }
}
