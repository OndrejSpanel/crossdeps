import org.scalatest._

class JVMTest extends FunSuite {

  test("Do nothing") {
    assert(true)
  }
  test("Say hello") {
    assert(true)
    info("Hello from Scala.jvm")
  }
  test("Use shared code") {
    val name = Shared.libName
    info(s"Using $name")
  }
}