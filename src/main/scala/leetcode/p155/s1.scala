package leetcode
package p155

import scala.math.Ordering.Implicits._

/** Use Two stacks
  *
  */
class MinStack[A: Ordering]() {

  var ms = List.empty[A]
  var ls = List.empty[A]

  def push(x: A)(implicit oa: Ordering[A]): Unit = {
    this.ls = x :: this.ls
    this.ms match {
      case h :: t if oa.gteq(h, x) => this.ms = x :: this.ms
      case h :: t if oa.lt(h, x)   => ()
      case Nil                     => this.ms = x :: this.ms
    }
  }

  def pop()(implicit oa: Ordering[A]): Unit = this.ls match {
    case h :: t => {
      this.ls = t
      this.ms match {
        case mh :: mt if oa.equiv(mh, h)  => this.ms = mt
        case mh :: mt if !oa.equiv(mh, h) => ()
        case Nil                          => ()
      }
    }
    case Nil => ()
  }

  def top(): A = this.ls.head

  def getMin(): A = this.ms.head

}
