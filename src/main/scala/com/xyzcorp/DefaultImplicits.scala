package com.xyzcorp

object DefaultImplicits extends App {
  val m = 1 -> "One"
  println(m)

  val map = Map(1 -> "One", 2 -> "Two", 3 -> "Three")
  println(map)
  println(map(1))
}
