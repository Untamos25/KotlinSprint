package lesson_5

import kotlin.random.Random

fun main() {

    val listWin = listOf(Random.nextInt(0, 42), Random.nextInt(0, 42), Random.nextInt(0, 42))
    val listUser = mutableListOf<Int?>(null, null, null)

    println("Введите последовательно 3 числа от 0 до 42 включительно.")

    print("Введите первое число: ")
    listUser[0] = readln().toInt()
    while (listUser[0]!! < 0 || listUser[0]!! > 42) {
        print("Недопустимое число!\nЧисло должно быть в интервале от 0 до 42. Попробуйте ещё раз.\nВведите первое число: ")
        listUser[0] = readln().toInt()
    }

    print("Введите второе число: ")
    listUser[1] = readln().toInt()
    while (listUser[1]!! < 0 || listUser[1]!! > 42) {
        print("Недопустимое число!\nЧисло должно быть в интервале от 0 до 42. Попробуйте ещё раз.\nВведите второе число: ")
        listUser[1] = readln().toInt()
    }

    print("Введите третье число: ")
    listUser[2] = readln().toInt()
    while (listUser[2]!! < 0 || listUser[2]!! > 42) {
        print("Недопустимое число!\nЧисло должно быть в интервале от 0 до 42. Попробуйте ещё раз.\nВведите третье число: ")
        listUser[2] = readln().toInt()
    }

    println("--------------------")
    val intersection = listUser.intersect(listWin)
    when (intersection.size) {
        3 -> println("Поздравляем! Вы угадали все числа и выиграли джекпот!")
        2 -> println("Вы угадали 2 числа и выиграли крупный приз!")
        1 -> println("Вы угадали 1 число и выиграли утешительный приз!")
        else -> println("Вы не угадали ни одного числа. Попробуйте ещё раз!")
    }
    println("Загаданные числа: ${listWin.joinToString(", ")}.")

}