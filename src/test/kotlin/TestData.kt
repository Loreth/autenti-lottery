const val LOTTO_DRAWS_COUNT = 6
const val LOTTO_MIN_NUMBER = 1
const val LOTTO_MAX_NUMBER = 46
const val NUMBERS_REMAINING_AFTER_PULLING = 43

fun numberPool() = NumberPool(LOTTO_MIN_NUMBER, LOTTO_MAX_NUMBER)
fun indexesToPullOut(): Iterable<Int> = 2..4
