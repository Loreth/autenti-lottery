class Lottery(private val random: RandomNumberGenerator) {

    fun draw(game: Game): Set<Int> {
        val numberPool = NumberPool(game.minNumber, game.maxNumber)

        return generateSequence { pullOutRandomNumber(numberPool) }
            .take(game.drawsCount)
            .toSet()
    }

    private fun pullOutRandomNumber(numberPool: NumberPool): Int {
        val index = random.nextNumber(0, numberPool.numbersRemaining)
        return numberPool.pullOut(index)
    }
}
