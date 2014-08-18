trait TestTrait
object TestObject extends TestTrait

object Go {
  def test(t: TestTrait): Unit = t match {
    case TestObject ⇒ println("ok")
  }
}
