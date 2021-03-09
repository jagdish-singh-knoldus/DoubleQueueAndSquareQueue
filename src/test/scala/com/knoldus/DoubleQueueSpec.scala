package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class DoubleQueueSpec extends AnyFlatSpec {
  val doubleQueue = new DoubleQueue
  val squareQueue = new SquareQueue

  "It" should "Double the items before appending" in {
    val res = doubleQueue.double(2)
    assert(res == 4)
  }

  "It" should "Square the items before appending" in {
    val res = squareQueue.square(3)
    assert(res == 9)
  }
  "main class" should "be executed" in{
    val output=QueueImplementation.main(Array(""))
    assert(doubleQueue.isEmpty)
  }
}
