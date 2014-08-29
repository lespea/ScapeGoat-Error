case class TestClass(attr: Int, var varAttr: Int, private val privateValAttr: Int, private var privateVarAttr: Int) {
  val innerVal = 5
  final val innerValFinal = 5
  def defTest = 5
  final def TestFinal = 5
}

final case class TestFinalClass(attr: Int, var varAttr: Int, private val privateValAttr: Int, private var privateVarAttr: Int) {
  val innerVal = 5
  final val innerValFinal = 5
  def defTest = 5
  final def TestFinal = 5
}

object Test {
  val a = TestClass(1, 1, 1, 1)
  val b = TestFinalClass(1, 1, 1, 1)

  final val finalA = TestClass(1, 1, 1, 1)
  final val finalB = TestFinalClass(1, 1, 1, 1)
}
