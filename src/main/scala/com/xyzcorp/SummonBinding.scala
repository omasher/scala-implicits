package com.xyzcorp

case class IceCream(name: String)

case class Scoops(num: Int, flavor: IceCream)

object SummonBinding extends App {
  implicit val flavorOfTheMonth: IceCream = IceCream("Rainbow Sherbet")

  def orderIceCream(num: Int)(implicit flavorOfTheMonth: IceCream) = {
    Scoops(num, flavorOfTheMonth)
  }

  println(orderIceCream(4))
  println((orderIceCream(4)(IceCream("Rocky Road"))))
}
