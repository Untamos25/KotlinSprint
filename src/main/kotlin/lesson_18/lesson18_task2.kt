package lesson_18

open class Dice {
    open fun getDicePoints() = ""
}

class D4(private val maxDicePoints: Int = 4) : Dice() {
    override fun getDicePoints(): String {
        return "Результат броска: ${(1..maxDicePoints).random()}"
    }
}

class D6(private val maxDicePoints: Int = 6) : Dice() {
    override fun getDicePoints(): String {
        return "Результат броска: ${(1..maxDicePoints).random()}"
    }
}

class D8(private val maxDicePoints: Int = 8) : Dice() {
    override fun getDicePoints(): String {
        return "Результат броска: ${(1..maxDicePoints).random()}"
    }
}

fun rollAllDices(dices: List<Dice>){
    dices.forEach{
        println(it.getDicePoints())
    }
}

fun main() {
    val d4 = D4()
    val d6 = D6()
    val d8 = D8()

    val listOfDices = listOf<Dice>(d4, d6, d8)

    rollAllDices(listOfDices)
}