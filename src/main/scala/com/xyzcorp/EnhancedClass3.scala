package com.xyzcorp

object EnhancedClass3 extends App {
  implicit final class ExclaimClass[A](private val v: A) {
    def exclaim: String = v.toString + "!"
  }

  println(10.exclaim)
  println("Hello".exclaim)
  println(List(1, 2, 3).exclaim)
}
