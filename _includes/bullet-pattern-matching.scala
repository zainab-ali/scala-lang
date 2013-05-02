abstract class Tree[T]
case class Node[T](elem: T, left: Tree[T], right: Tree[T]) extends Tree[T]
case object Leaf extends Tree[Nothing]

def inOrder[T](t: Tree[T]): List[T] = t match {
  case Node(e, l, r) => inOrder(l) ::: List(e) ::: inOrder(r)
  case Leaf          => List()
}
