package lesson_10

fun main() {
    playGame()
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
        else -> {
            println("\nНичья! Игра начинается заново.")
            playGame()
        }
    }
}


