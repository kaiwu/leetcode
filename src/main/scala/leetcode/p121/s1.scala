package leetcode
package p121

import Math.{max, min}
object Solution1 {
  def maxProfit(prices: Array[Int]): Int = {
    prices
      .foldLeft((Int.MaxValue, 0)) {
        case ((min_price, max_profit), i) => {
          val mp = min(min_price, i)
          (mp, max(max_profit, i - mp))
        }
      }
      ._2
  }
}
