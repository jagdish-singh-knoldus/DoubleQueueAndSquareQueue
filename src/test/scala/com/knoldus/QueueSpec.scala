package com.knoldus
import org.scalatest.flatspec.AnyFlatSpec

class QueueSpec extends AnyFlatSpec {
  val queue = new Object with Queue[Int]


  "true" should " be returned for empty queue" in{
    val res=queue.isEmpty
    assert(res==true)
  }

  "success" should " be returned for dequeue" in{
    queue.enqueue(2)
    val res=queue.dequeue
    assert(queue.isEmpty)
  }
  "failed" should " be returned for dequeue when queue is empty" in{
    val res =queue.dequeue
    assert(res=="No element found")
  }
  "success" should "be returned fo successful print" in{
    queue.enqueue(2)
    queue.enqueue(4)
    queue.enqueue(6)
    queue.toString()
    assert(!queue.isEmpty)
  }
}