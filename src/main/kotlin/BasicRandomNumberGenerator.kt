import kotlin.random.Random

class BasicRandomNumberGenerator : RandomNumberGenerator {
    override fun nextNumber(fromInclusive: Int, toExclusive: Int): Int {
        return Random.nextInt(fromInclusive, toExclusive)
    }
}
