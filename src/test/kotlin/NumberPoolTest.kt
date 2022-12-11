import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberPoolTest {

    @Test
    fun `should return correct amount of numbers remaining when no numbers were pulled out`() {
        //given
        val numberPool = numberPool()

        //when
        val numbersRemaining = numberPool.numbersRemaining

        //then
        assertEquals(LOTTO_MAX_NUMBER, numbersRemaining)
    }

    @Test
    fun `should return correct amount of numbers remaining when two numbers were pulled out`() {
        //given
        val numberPool = numberPool()

        //when
        indexesToPullOut().forEach { numberPool.pullOut(it) }
        val numbersRemaining = numberPool.numbersRemaining

        //then
        assertEquals(NUMBERS_REMAINING_AFTER_PULLING, numbersRemaining)
    }
}
