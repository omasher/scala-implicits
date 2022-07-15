package com.xyzcorp

object DefaultImplicits extends App {
  val m = 1 -> "One"
  println(m)

  val map = Map(1 -> "One", 2 -> "Two", 3 -> "Three")
  println(map)
  println(map(1))

  //max comes from RichInt
  println(10.max(3))

  //to is a method in RichInt, this is how a range is created
  (1 to 10).foreach(println)

  //toHexString is a method in RichInt
  println(30.toHexString)
}
