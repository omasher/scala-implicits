package com.xyzcorp

import scala.language.implicitConversions

sealed abstract class Currency
case class Dollar(value: Int) extends Currency
case class Shilling(value: Int) extends Currency
case class Euro(value: Int) extends Currency

object CurrencyApp extends App{
//  implicit def int2Dollar(i: Int): Dollar = Dollar(i)

  implicit val int2Dollar: Int => Dollar = (i: Int) => Dollar(i)

  def combine(x: Dollar, y: Dollar): Dollar = Dollar(x.value + y.value)

  println(combine(100, 100))
}
