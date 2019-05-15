package leetcode
package p155

/** Use Two stacks
  *
  */
class MinStack() {

  var ms = List.empty[Int]
  var ls = List.empty[Int]

  def push(x: Int): Unit = {
    this.ls = x :: this.ls
    this.ms match {
      case h :: t if h >= x => this.ms = x :: this.ms
      case h :: t if h < x  => ()
      case Nil              => this.ms = x :: this.ms
    }
  }

  def pop(): Unit = this.ls match {
    case h :: t => {
      this.ls = t
      this.ms match {
        case mh :: mt if mh == h => this.ms = mt
        case mh :: mt if mh != h => ()
        case Nil                 => ()
      }
    }
    case Nil => ()
  }

  def top(): Int = if (ls.isEmpty) Int.MaxValue else this.ls.head

  def getMin(): Int = if (ms.isEmpty) Int.MaxValue else this.ms.head

}
