package lesson_10

private const val POSITIVE_ANSWER = "ДА"

fun main() {
    var roundCounter = 0
    var userWinsCounter = 0

    do {
        println("\nРаунд ${++roundCounter}.")
        var turn = "Ход игрока."
        val diceUser = rollTheDice(turn)
        turn = "\nХод оппонента."
        val diceComp = rollTheDice(turn)

        when {
            diceUser > diceComp -> {
                println("\nВы выиграли!")
                userWinsCounter++
            }
            diceUser < diceComp -> println("\nВы проиграли.")
            else -> println("\nНичья!")
        }
        print("Хотите бросить кости ещё раз? (Да / Нет) ")
    } while (readln().uppercase() == POSITIVE_ANSWER)

    println("\nИгра окончена.\nВыиграно раундов: $userWinsCounter из $roundCounter")
}

private fun generateDiceValue() = (1..6).random()

private fun rollTheDice(turn: String): Int {
    println(turn)
    if (turn == "Ход игрока.") {
        print("Нажмите Enter, чтобы бросить кости")
        readln()
    }
    val dice = generateDiceValue()
    println("Очков на костях: $dice")
    Thread.sleep(1500)
    return dice
}