import org.scalatest._

class SharedTest extends FunSuite {
  test("Shared: Say hello") {
    assert(true)
    info("Hello from the shared code")
  }
}