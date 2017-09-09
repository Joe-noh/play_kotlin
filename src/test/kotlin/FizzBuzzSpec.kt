import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.junit.Assert.assertEquals
import play_kotlin.FizzBuzz

object FizzBuzzSpec : Spek({
    describe("judge") {
        val fb = FizzBuzz()

        assertEquals("1",    fb.judge(1))
        assertEquals("2",    fb.judge(2))
        assertEquals("Fizz", fb.judge(3))
        assertEquals("4",    fb.judge(4))
        assertEquals("Buzz", fb.judge(5))
    }
})