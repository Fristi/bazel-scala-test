import zio.test._
import zio.test.junit.JUnitRunnableSpec

class CalculatorTest extends JUnitRunnableSpec {
  override def spec = suite("CalculatorTest")(
    test("add")(assert(Calculator.add(1, 2))(Assertion.equalTo(3)))
  )

}