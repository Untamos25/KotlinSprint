package lesson_9

import java.util.*

private const val NUMBER_OF_INGREDIENTS = 5

fun main() {

    val list = mutableSetOf<String>()
    var input: String?
    println("Введите последовательно $NUMBER_OF_INGREDIENTS ингредиентов: ")

    for (i in 1..NUMBER_OF_INGREDIENTS) {
        print("Введите ингредиент #$i: ")
        input = readln()
        while (input == "" || input == null) {
            print("Вы ничего не ввели. Попробуйте ещё раз.\nВведите ингредиент #$i: ")
            input = readln()
        }
        list.add(input.lowercase())
    }

    val sorted = list.sorted().toMutableList()
    sorted[0] =
        sorted[0].replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    println(sorted.joinToString())

}