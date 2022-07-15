package com.xyzcorp

object EnhancedClass2 extends App {

  implicit class IntWrapper(x: Int) {
    def isOdd: Boolean = x % 2 != 0

    def isEven: Boolean = x % 2 == 0
  }

  import scala.language.implicitConversions

  println(10.isOdd)
  println(10.isEven)

}
