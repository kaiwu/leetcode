package leetcode
package p155

import scala.math.Ordering.Implicits.infixOrderingOps

/** Use Two stacks
  *
  */
class MinStack[A: Ordering]() {

  var ms = List.empty[A]
  var ls = List.empty[A]

  def push(x: A): Unit = {
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
        case mh :: mt if mh.equiv(h)  => this.ms = mt
        case mh :: mt if !mh.equiv(h) => ()
        case Nil                      => ()
      }
    }
    case Nil => ()
  }

  def top(): A = this.ls.head

  def getMin(): A = this.ms.head

}
