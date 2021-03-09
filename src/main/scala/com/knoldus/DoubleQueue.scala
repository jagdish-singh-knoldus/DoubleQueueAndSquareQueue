package com.knoldus

class DoubleQueue  extends Queue [Int]{
  def double(element: Int): Int = 2*element
}

class SquareQueue extends Queue[Int]{
  def square(element: Int):Int =  Math.pow(element,2).toInt
}


object  QueueImplementation {
  def main(args: Array[String]): Unit = {
    val d = new DoubleQueue
    val s = new SquareQueue
    println("Queue is empty: " + d.isEmpty)
    d.enqueue(d.double(1))
    d.enqueue(d.double(2))
    d.enqueue(d.double(3))
    d.enqueue(d.double(4))
    d.enqueue(d.double(5))
    d.enqueue(d.double(6))
    println("Queue: " + d)
    println("Dequeue: " + d.dequeue)
    println("Dequeue: " + d.dequeue)
    println("Queue is empty: " + d.isEmpty)
    println("Queue is empty: " + d.isEmpty)
    s.enqueue(s.square(9))
    println(s)
    s.enqueue(s.square(1))
    s.enqueue(s.square(11))
    s.enqueue(s.square(12))
    s.enqueue(s.square(13))
    s.enqueue(s.square(14))
    s.enqueue(s.square(15))
    println("Queue: " + s)
    println("Dequeue: " + s.dequeue)
    println("Dequeue: " + s.dequeue)
    println("Queue: " + s)
    println("Queue is empty: " + s.isEmpty)
  }
}

