package com.xyzcorp

object ServiceBindManual extends App {

  import scala.concurrent._
  import java.util.concurrent.Executors

  val executor = Executors.newFixedThreadPool(4)
  val executionContext: ExecutionContext = ExecutionContext.fromExecutor(executor)

  val future = Future.apply {
    println(s"Thread-name: ${Thread.currentThread().getName}")
    Thread.sleep(3000)
    50 + 100
  }(executionContext)
  future
    .map(x => x * 100)(executionContext)
    .foreach(a => println(a))(executionContext)

  Thread.sleep(5000)
  System.exit(0)
}