import io.kotest.core.spec.style.FunSpec
import io.kotest.core.test.TestCase.Companion.test
import io.kotest.matchers.shouldBe

class ExampleTest : FunSpec({
    test("example") {
        7 * 6 shouldBe 42
    }
})
