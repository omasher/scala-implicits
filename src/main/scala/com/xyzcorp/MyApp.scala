package com.xyzcorp

object MyApp {
  case class Rate(value: Int)
  case class Age(value: Int)

  implicit val rate: Rate = Rate(100)
  implicit val age: Age = Age(26)

  def calcPayment(hours: Int)(implicit rate: Rate): Int = hours * rate.value


  def main(args: Array[String]): Unit = {
    println(calcPayment(30))
  }

}
