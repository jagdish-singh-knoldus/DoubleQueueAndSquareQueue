package com.knoldus

trait Queue[T] {
    private[this] class Node[`T`](val value:T) {
      var next:Option[Node[T]]=None
      def append(n:Node[T]):Unit=next=Some(n)
    }
    private[this] var head:Option[Node[T]]=None
    private[this] var tail:Option[Node[T]]=None

    def isEmpty=head.isEmpty

    def enqueue(item:T):Unit={
      val n=new Node(item)
      if(isEmpty)
        head=Some(n)
      else
        tail.get.append(n)
      tail=Some(n)
    }

    def dequeue=head match {
      case Some(item) => head=item.next; item.value
      case None => "No element found"
    }

  def iterator: Iterator[T]=new Iterator[T]{
    private[this] var it=head;
    override def hasNext=it.isDefined
    override def next:T={
      val n=it.get
      it=n.next
      n.value
    }
  }

 override def toString()=iterator.mkString("Queue(", ", ", ")")
}