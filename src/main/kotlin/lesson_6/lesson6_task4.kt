package lesson_6

private const val NUMBER_MIN = 1
private const val NUMBER_MAX = 9

fun main() {

    val numberWin = (NUMBER_MIN..NUMBER_MAX).random()
    var numberOfTries = 5

    println(
        """
        *** ИГРА УГАДАЙКА ***
        Загадано целое число от $NUMBER_MIN до $NUMBER_MAX включительно.
        У вас $numberOfTries попыток, чтобы угадать это число.
        
    """.trimIndent()
    )

    do {
        print("Введите число от $NUMBER_MIN до $NUMBER_MAX: ")
        var input: String? = readln()
        while (input == null || !input.matches(Regex("\\d+")) || input.toInt() < NUMBER_MIN || input.toInt() > NUMBER_MAX) {
            print(
                "Недопустимое значение!\nВам нужно ввести целое число от $NUMBER_MIN до $NUMBER_MAX. " +
                        "Попробуйте ещё раз.\nВведите число: "
            )
            input = readln()
        }
        val numberUser = input.toInt()

        numberOfTries--

        if (numberUser == numberWin) println("Это была великолепная игра!")
        else {
            println("Неверно.Осталось попыток: $numberOfTries \n")
            if (numberOfTries == 0) println("Было загадано число $numberWin")
        }

    } while (numberOfTries > 0 && numberUser != numberWin)

}