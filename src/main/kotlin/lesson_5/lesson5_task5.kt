package lesson_5

import kotlin.random.Random
import kotlin.system.exitProcess

private const val AMOUNT_OF_WIN_NUMBERS = 3    // Количество выигрышных чисел
private const val AMOUNT_OF_USER_NUMBERS = 3    // Количество чисел, которое может ввести игрок
private const val NUMBER_MIN = 0
private const val NUMBER_MAX = 42

fun main() {

    // Проверка условия для возможности реализации всех выигрышных комбинаций

    if (AMOUNT_OF_USER_NUMBERS < AMOUNT_OF_WIN_NUMBERS) {
        print("Условие викторины задано некорректно:\n" +
                "количество вводимых игроком чисел не может быть меньше количества загаданных.")
        exitProcess(0)
    }

    val listWin = (0..<AMOUNT_OF_WIN_NUMBERS).map { Random.nextInt(NUMBER_MIN, NUMBER_MAX + 1) }
    val listUser = MutableList<Int?>(AMOUNT_OF_USER_NUMBERS) { null }

    println("Викторина! Угадайте загаданные числа и получите приз!\nЗагадано чисел: $AMOUNT_OF_WIN_NUMBERS \n")

    // Зависимость приветственного сообщения от количества чисел, которое может ввести игрок

    val lastNumber = if (listUser.size !in 10..20) listUser.size.toString().last().digitToInt() else listUser.size
    when (lastNumber) {
        1 -> println("Введите ${listUser.size} число от $NUMBER_MIN до $NUMBER_MAX включительно.")
        in 2..4 -> println("Введите последовательно ${listUser.size} числа от $NUMBER_MIN до $NUMBER_MAX включительно.")
        else -> println("Введите последовательно ${listUser.size} чисел от $NUMBER_MIN до $NUMBER_MAX включительно.")
    }

    // Проверка введённого значения игроком и запись этого значения в список

    for (i in listUser.indices) {
        print("Введите ${i + 1}-е число: ")
        var input: String? = readln()
        while (input == null || !input.matches(Regex("\\d+")) || input.toInt() < NUMBER_MIN || input.toInt() > NUMBER_MAX) {
            print(
                "Недопустимое число!\nЧисло должно быть целым в интервале от $NUMBER_MIN до $NUMBER_MAX." +
                        "Попробуйте ещё раз.\nВведите ${i + 1}-е число: "
            )
            input = readln()
        }
        listUser[i] = input.toInt()
    }

    // Сравнение списков и вывод результата

    println("--------------------")
    val intersection = listUser.intersect(listWin)
    when (intersection.size) {
        2 -> println("Вы угадали 2 числа и выиграли крупный приз!")
        1 -> println("Вы угадали 1 число и выиграли утешительный приз!")
        0 -> println("Вы не угадали ни одного числа. Попробуйте ещё раз!")
        else -> println("Поздравляем! Вы угадали все числа и выиграли джекпот!")
    }
    println("Ваши числа: ${listUser.joinToString(", ")}.")
    println("Загаданные числа: ${listWin.joinToString(", ")}.")

}
