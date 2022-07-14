package com.xyzcorp

object MyApp {
  implicit val rate: Int = 100

  def calcPayment(hours: Int)(implicit rate: Int): Int = hours * rate


  def main(args: Array[String]): Unit = {
    println(calcPayment(30)(110))
  }

}
