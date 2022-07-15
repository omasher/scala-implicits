package com.xyzcorp

case class Team(city: String, mascot: String)

object MyPredef3 {
  implicit val teamsSortedByCity: Ordering[Team] = (x: Team, y: Team) => x.city compare y.city
  implicit val teamsSortedByMascot: Ordering[Team] = (x: Team, y: Team) => x.mascot compare y.mascot
}

object DefaultImplicitOrdering extends App {
  //Create some sports teams
  val teams = List(Team("Cincinnati", "Bengals"),
    Team("Madrid", "Real Madrid"),
    Team("Las Vegas", "Golden Knights"),
    Team("Houston", "Astros"),
    Team("Cleveland", "Cavaliers"),
    Team("Arizona", "Diamondbacks"))

  import MyPredef3.teamsSortedByCity

  println(teams.min.city)
}
