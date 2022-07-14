package com.xyzcorp

object ServiceBindImplicit extends App {

  import scala.concurrent._
  import java.util.concurrent.Executors

  val executor = Executors.newFixedThreadPool(4)
  implicit val executionContext: ExecutionContext = ExecutionContext.fromExecutor(executor)

  val future = Future.apply {
    println(s"Thread-name: ${Thread.currentThread().getName}")
    Thread.sleep(3000)
    50 + 100
  }
  future
    .map(x => x * 100)
    .foreach(a => println(a))

  Thread.sleep(5000)
  System.exit(0)
}