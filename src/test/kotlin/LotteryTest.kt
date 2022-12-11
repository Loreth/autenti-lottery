import Game.LOTTO
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LotteryTest {

    val lottery = Lottery(BasicRandomNumberGenerator())

    @Test
    fun `should return correct amount of numbers in expected range when playing lotto`() {
        //when
        val draws = lottery.draw(LOTTO)

        //then
        assertEquals(LOTTO_DRAWS_COUNT, draws.size)

        for (draw in draws) {
            assertTrue(draw in LOTTO_MIN_NUMBER..LOTTO_MAX_NUMBER)
        }
    }
}
