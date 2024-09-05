package lesson_18

abstract class Dice(val faces: Int) {
    abstract fun rollTheDice(): String
}

class DiceWith4Faces(faces: Int = 4) : Dice(faces) {
    override fun rollTheDice(): String {
        return "Результат броска кости d4: ${(1..faces).random()}"
    }
}

class DiceWith6Faces(faces: Int = 6) : Dice(faces) {
    override fun rollTheDice(): String {
        return "Результат броска кости d6: ${(1..faces).random()}"
    }
}

class DiceWith8Faces(faces: Int = 8) : Dice(faces) {
    override fun rollTheDice(): String {
        return "Результат броска кости d8: ${(1..faces).random()}"
    }
}

fun main() {
    val d4 = DiceWith4Faces()
    val d6 = DiceWith6Faces()
    val d8 = DiceWith8Faces()

    val listOfDices = listOf<Dice>(d4, d6, d8)
    listOfDices.forEach{
        println(it.rollTheDice())
    }
}