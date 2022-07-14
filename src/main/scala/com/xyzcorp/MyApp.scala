package com.xyzcorp

object MyApp {
  implicit val rate: Int = 100

  def calcPayment(hours: Int)(implicit n: Int): Int = hours * n


  def main(args: Array[String]): Unit = {
    println(calcPayment(30))
  }

}
