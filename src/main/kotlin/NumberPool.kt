class NumberPool(minNumber: Int, maxNumber: Int) {
    init {
        check(minNumber <= maxNumber)
    }

    private val pool: MutableList<Int> = (minNumber..maxNumber).toMutableList()
    val numbersRemaining get() = pool.size

    fun pullOut(index: Int): Int {
        return pool.removeAt(index)
    }
}
