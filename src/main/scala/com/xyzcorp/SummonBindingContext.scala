package com.xyzcorp

case class IceCream(name: String)

case class Scoops(num: Int, flavor: IceCream)

object SummonBindingContext extends App {
  implicit val flavorOfTheMonth: IceCream = IceCream("Rainbow Sherbet")

  def orderIceCream(num: Int) = {
    Scoops(num, implicitly[IceCream])
  }

  println(orderIceCream(4))
}
