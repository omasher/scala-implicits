package com.xyzcorp

case class IceCream(name: String)

case class Scoops(num: Int, flavor: IceCream)

object SummonBindingContext extends App {
  implicit val flavorOfTheMonth: IceCream = IceCream("Rainbow Sherbet")
  implicit val listOfStrings: List[String] = List("Foo", "Bar", "Baz")
  implicit val listOfDouble: List[Double] = List(1.0, 2.0, 3.0)

  def orderIceCream(num: Int) = {
    Scoops(num, implicitly[IceCream])
  }

  println(orderIceCream(4))

  val result = implicitly[List[Double]]
  println(result(1))
}
