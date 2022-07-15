package com.xyzcorp

class IntWrapper(x: Int) {
  def isOdd: Boolean = x % 2 != 0

  def isEven: Boolean = x % 2 == 0
}

object EnhancedClass extends App {

  import scala.language.implicitConversions

  implicit def int2IntWrapper(x: Int): IntWrapper = new IntWrapper(x)

  println(10.isOdd)
  println(10.isEven)

}
