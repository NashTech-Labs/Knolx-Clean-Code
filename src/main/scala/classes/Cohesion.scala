package classes

/**
  * 2 out of 3 methods using both the variables . So highly cohesive.
  */
class Cohesion {
  var elements = List[Int]()
  private var topOfStack = 0

  def size = {
    topOfStack
  }

  def push(element: Int) = {
    topOfStack = topOfStack + 1
    elements = elements :+ element
    elements
  }

  def pop() = {
    val element: Int = elements.head
    topOfStack = topOfStack - 1
    elements = elements.tail
    element
  }
}

