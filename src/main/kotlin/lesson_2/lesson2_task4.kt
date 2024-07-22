package lesson_2

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buffBonus = 0.2f

    val bonusCrystalOre = crystalOre * buffBonus
    val bonusIronOre = ironOre * buffBonus

    println("Количество бонусной кристаллической руды: ${bonusCrystalOre.toInt()}")
    println("Количество бонусной железной руды: ${bonusIronOre.toInt()}")

}