package lesson_5

private const val NUMBER_MIN = 0
private const val NUMBER_MAX = 42

fun main() {
    val numberWin1 = 7
    val numberWin2 = 13

    println(
        """Правила викторины:
        |Введите последовательно 2 числа от 0 до 42 включительно.
        |Если вы угадали 2 числа, вы получаете главный приз!
        |Если угадали только одно число - вас ждёт утешительный приз.
        |-------------------------
    """.trimMargin()
    )

    print("Введите первое число: ")
    var numberUser1 = readln().toInt()
    while (numberUser1 < NUMBER_MIN || numberUser1 > NUMBER_MAX) {
        print(
            "Недопустимое число!\nЧисло должно быть в интервале от 0 до 42. " +
                    "Попробуйте ещё раз.\nВведите первое число: "
        )
        numberUser1 = readln().toInt()
    }

    print("Введите второе число: ")
    var numberUser2 = readln().toInt()
    while (numberUser2 < NUMBER_MIN || numberUser2 > NUMBER_MAX) {
        print(
            "Недопустимое число!\nЧисло должно быть в интервале от 0 до 42. " +
                    "Попробуйте ещё раз.\nВведите второе число: "
        )
        numberUser2 = readln().toInt()
    }

    when {
        (numberUser1 == numberWin1 || numberUser1 == numberWin2) &&
                (numberUser2 == numberWin1 || numberUser2 == numberWin2) -> println(
            "Поздравляем! Вы выиграли главный приз!"
        )

        (numberUser1 == numberWin1 || numberUser1 == numberWin2) ||
                (numberUser2 == numberWin1 || numberUser2 == numberWin2) -> println(
            "Вы выиграли утешительный приз!"
        )

        else -> println("Неудача")
    }

}
