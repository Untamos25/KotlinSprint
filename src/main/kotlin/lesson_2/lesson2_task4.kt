package lesson_2

    const val MAX_PERCENT = 100

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buffBonusPercent = 20

    val bonusCrystalOre = crystalOre * buffBonusPercent / MAX_PERCENT
    val bonusIronOre = ironOre * buffBonusPercent / MAX_PERCENT

    println("Количество бонусной кристаллической руды: ${bonusCrystalOre}")
    println("Количество бонусной железной руды: ${bonusIronOre}")

}