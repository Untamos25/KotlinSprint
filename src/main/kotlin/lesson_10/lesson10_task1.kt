package lesson_10

fun main() {
    var turn = "Ход игрока."
    val diceUser = rollTheDice(turn)
    turn = "\nХод оппонента."
    val diceComp = rollTheDice(turn)

    when {
        diceUser > diceComp -> println("\nВы выиграли!")
        diceUser < diceComp -> println("\nВы проиграли.")
        else -> println("\nНичья!")
    }
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