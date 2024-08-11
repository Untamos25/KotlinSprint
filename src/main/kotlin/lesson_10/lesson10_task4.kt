package lesson_10

private const val POSITIVE_ANSWER = "ДА"

fun main() {
    var counter = 0
    do {
        print("\nРаунд ${++counter}.")
        playGame()
        print("Хотите бросить кости ещё раз? (Да / Нет) ")
    } while (readln().uppercase() == POSITIVE_ANSWER)
    println("\nИгра окончена.\nСыграно раундов: $counter")
}

private fun rollTheDice() = (1..6).random()

private fun playGame() {
    print("\nХод игрока.\nНажмите Enter, чтобы бросить кости")
    readln()
    val diceUser = rollTheDice()
    println("Очки игрока: $diceUser")
    Thread.sleep(1500)

    println("\nХод оппонента.")
    val diceComp = rollTheDice()
    println("Очки оппонента: $diceComp")
    Thread.sleep(1500)

    when {
        diceUser > diceComp -> println("\nВы выиграли!")
        diceUser < diceComp -> println("\nВы проиграли.")
        else -> println("\nНичья!")
    }
}
