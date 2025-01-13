package st

object TestObject {

  def test1(width: Int, a: Int, b: Int): Int = {
    assert(false)
    width
  }

  def test2(width: Int, a: Int, b: Int): Int = {
    a / b
  }

  def main(args: Array[String]): Unit = {
    test1(1, 0, 3)
  }
}
