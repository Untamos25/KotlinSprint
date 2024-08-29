package lesson_16

class Dice {
    private val dicePoints = (1..6).random()

    fun getPoints() {
        println(dicePoints)
    }
}

fun main() {
    val dice1 = Dice()
    dice1.getPoints()
}